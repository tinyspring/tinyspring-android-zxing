ZXing plugin for Tinyspring Android
=======

Adds ZXing dependencies and integrates the custom scanning downloader with your application - so when user clicks on the scan button and doesn't have any barcode scanning application installed, the popup window will offer him to download free zxing scanner and use it.

#### Just add following lines to your ivy.xml/pom.xml

```xml
<dependency org="com.tinyspring" name="tinyspring-android-zxing" rev="0.2.0" />
```

```xml
<dependency>
	<groupId>com.tinyspring</groupId>
	<artifactId>tinyspring-android-zxing</artifactId>
	<version>0.2.0</version>
</dependency>
```

#### And then in your activity use IntentIntegrator class. 

```
@OnClick(R.id.search_scan_button)
public void scan(View view) {
	new IntentIntegrator(this).initiateScan();
}
```
