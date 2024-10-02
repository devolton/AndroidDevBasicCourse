package common

class CustomSort {
    companion object{
        fun  bubbleSort(array:IntArray){
          var arrayLength = array.size;
            for(i in 0..arrayLength-1){
                for(j in i+1..arrayLength-1){
                    if(array[i]>array[j]){
                        var temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;

                    }
                }
            }

        }
        fun quickSort(arr: IntArray, low: Int = 0, high: Int = arr.size - 1) {
            if (low < high) {
                val supportIndex = getSupportElementIndex(arr, low, high)

                quickSort(arr, low, supportIndex - 1);
                quickSort(arr, supportIndex + 1, high);
            }
        }

         private fun getSupportElementIndex(arr: IntArray, low: Int, high: Int): Int {
            val pivot = arr[high]
            var i = low - 1

            for (j in low until  high) {
                if (arr[j] <= pivot) {
                    i++
                    arr.swap(i, j)
                }
            }
            arr.swap(i + 1, high)
            return i + 1
        }

        private fun IntArray.swap(i: Int, j: Int) {
            val temp = this[i];
            this[i] = this[j];
            this[j] = temp;
        }


    }
}