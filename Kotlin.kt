// Kotlin 


Lazy => var s : String by lazy
// was deigned to prevent unnecessary initializations of variables and objects 
// meaning that it won't be allocated in the ram memory unless we call it inside our code
// and if it gets called again in another part of the same scope it get fetched form
// the cache memory not initialized again!