# FlexibleRecyclerView
A recycler view where you can set the number of columns/rows and orientation on the .xml file instead of setting it on the layout manager.

## Import

### Maven

```
repositories {
    maven {
        url  "https://frontkom.bintray.com/FlexibleRecyclerView"
    }
}
    
dependencies {
  implementation 'com.tornelas.flexiblerecyclerview:flexiblerecyclerview:{latest-version}'
}

```
## Usage

```

 <com.tornelas.flexiblerecyclerview.FlexibleRecyclerView
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      app:columns="1"
      app:rows="5"
      app:orientation="vertical|horizontal"/>

```

## TODO

- [x] Extend Recyclerview
- [x] Add column and row attributes and funcionality
- [x] Add orientation attribute and funcionality
- [ ] Add scroll to top attribute and funcionality
- [ ] Publish library to jcenter
