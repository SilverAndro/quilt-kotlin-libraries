fun DependencyHandlerScope.includeApi(dependency: Any) {
    api(dependency)
    include(dependency)
}

dependencies {
    val kotlinVersion = rootProject.libs.versions.kotlin.get()

    includeApi(kotlin("stdlib", kotlinVersion))
    includeApi(kotlin("stdlib-jdk7", kotlinVersion))
    includeApi(kotlin("stdlib-jdk8", kotlinVersion))
    includeApi(kotlin("reflect", kotlinVersion))

    includeApi(rootProject.libs.coroutines.core.get())
    includeApi(rootProject.libs.coroutines.jvm.get())
    includeApi(rootProject.libs.coroutines.jdk8.get())
    includeApi(rootProject.libs.serialization.core.get())
    includeApi(rootProject.libs.serialization.json.get())
    includeApi(rootProject.libs.serialization.cbor.get())
    includeApi(rootProject.libs.atomic.get())
    includeApi(rootProject.libs.datetime.get())
}