#!/bin/bash

echo "🔨 Compiling..."
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar main/*.java testing/*.java

if [ $? -eq 0 ]; then
    echo "✅ Compilation successful!"
    
    echo ""
    echo "🧪 Running tests..."
    java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore testing.PizzaFactoryTest testing.PizzaStoreTest
    
    echo ""
    echo "🚀 Running main application..."
    java -cp . main.PizzaStore
else
    echo "❌ Compilation failed!"
fi