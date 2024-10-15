## Gufo Shadow

Очень простая библиотека для создания красивых теней к обьекту в Kotlin Compose.

Как ее использовать:

1. Испортируете эту библиотеку в своей проект.
2. Вызывайте модификатор `.shadow(borderRadius = )` и указываете нужное скругление. Пока работает только с DP значениями.
3. **Важно**: модификатор должен вызываться в самом начале, иначе тени не будет.

<img src="https://github.com/TimofeyMaryin/gufo-shadow/blob/main/img_1.png" width="300">

_Внизу по середине стоит базовый shadow из коробки Compose. В целом - не плохо выглядит, но иногда охота сделать тень как в IOS. Для этого используйте эту библиотеку!_

**Пример использования**:
``` Kotlin
Box(
  modifier = Modifier
    .shadow(
      borderRadius = 35.dp,
      blurRadius = 25.dp,
    )
  .clip(RoundedCornerShape(35.dp))
  .size(150.dp)
  .background(MaterialTheme.colorScheme.background)
)
```

Интегрировать библиотеку в проект:

1. libs.versions.toml
```libs.versions.toml
[libraries]
# another libs
custom-shadow = { group = "com.github.TimofeyMaryin", name = "gufo-shadow", version = "1.0.0" }
```

2. settigs.gradle.kts
```settigs.gradle.kts
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven { url = uri("https://jitpack.io") }
    }
}

```

3. build.gradle.kts(Module :app)
```build.gradle.kts
dependencies {
    // another libs
    ...
    implementation(libs.custom.shadow)
}
```
