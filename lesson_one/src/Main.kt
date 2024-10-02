//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  kotlin.system.measureTimeMillis;
import  kotlin.random.Random;
import common.CustomSort;
import factories.MongoDbFactory
import factories.MySqlFactory
import managers.DbManager;

fun main() {
    val arraySize = 1000;
    var arrForBubbleSort = IntArray(1000);
    for (i in 0..arraySize - 1) {
        arrForBubbleSort[i] = Random.nextInt(0, 10000);
    }
    var arrForQuickSort = arrForBubbleSort.copyOf();
    println("\nArray before sort:");
    arrForQuickSort.forEach { element -> print(element.toString() + ", ") }

    val bubbleSortTime = measureTimeMillis {
        CustomSort.bubbleSort(arrForBubbleSort);

    }
    println("\nArray after bubble sort (Time ${bubbleSortTime} milliseconds): ");
    arrForBubbleSort.forEach { element -> print(element.toString() + ", ") }

    val quickSortTime = measureTimeMillis {
        CustomSort.quickSort(arrForQuickSort);
    }
    println("\nArray after quick sort (Time: ${quickSortTime} milliseconds): ")
    arrForQuickSort.forEach { element -> print(element.toString() + ", ") }
    println("\nQuick sort faster then Bubble sort in: " + (bubbleSortTime / quickSortTime).toString());

    val mySqlFactory = MySqlFactory();
    val mongoDbFactory = MongoDbFactory();
    val dbManager = DbManager(mongoDbFactory);
    dbManager.setConnectionStr("mongoDb:/...");
    dbManager.connect();
    dbManager.disconnect();


}