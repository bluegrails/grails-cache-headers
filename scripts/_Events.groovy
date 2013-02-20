
includeTargets << grailsScript("_GrailsEvents")

eventPackagePluginStart = {
  println "cleaning for packaging ${classesDir}"
  ant.sequential {
    delete() {
      fileset(dir:classesDir) {
        include name:"com/grailsrocks/cacheheaders/Test*.*"
      }
    }
  }
}
