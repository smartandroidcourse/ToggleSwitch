<ol dir="auto">
<li>
<p dir="auto">Include the library as local library project:</p>
<div class="highlight highlight-source-groovy notranslate position-relative overflow-auto" dir="auto">
<pre><code id="depCodeGradle" class=" kode  language-css">maven <span class="token string">{url 'https://jitpack.io'}</span></code><span class="pl-s"><span class="pl-pds"><br /><br /></span></span></pre>
</div>
</li>
<li>
<p dir="auto">Include the library as local library project:</p>
<div class="highlight highlight-source-groovy notranslate position-relative overflow-auto" dir="auto">
<pre><code id="depCodeGradle" class=" kode  language-css">implementation <span class="token string">'com.github.smartandroidcourse:ToggleSwitch:1.0</span></code><span class="pl-s"><span class="pl-pds">'<br /><br /></span></span></pre>
</div>
</li>
<li>
<p dir="auto">Add view to your layout file:</p>
<div class="highlight highlight-text-xml notranslate position-relative overflow-auto" dir="auto">
<pre><span class="pl-c"><span class="pl-c">&lt;!--</span> ... <span class="pl-c">--&gt;</span></span></pre>
<pre>&lt;colorsfx.smart.android.courses.toggleswitch.ToggleSwitchButton<br />    android:id="@+id/toggle"<br />    style="@style/ToggleSwitchButton"<br />    android:layout_centerInParent="true" /&gt;</pre>
<pre><span class="pl-c"><span class="pl-c">&lt;!--</span> ... <span class="pl-c">--&gt;</span></span></pre>
<div class="zeroclipboard-container position-absolute right-0 top-0">&nbsp;</div>
</div>
</li>
<li>
<p dir="auto">Add to your <code>styles.xml</code>:</p>
<div class="highlight highlight-text-xml notranslate position-relative overflow-auto" dir="auto">
<pre>&lt;style name="ToggleSwitchButton"&gt;<br />    &lt;item name="android:layout_width"&gt;100dp&lt;/item&gt;<br />    &lt;item name="android:layout_height"&gt;wrap_content&lt;/item&gt;<br />    &lt;item name="android:layout_gravity"&gt;center&lt;/item&gt;<br />    &lt;item name="outerRadius"&gt;50dp&lt;/item&gt;<br />    &lt;item name="handleDrawable"&gt;@drawable/ic_add&lt;/item&gt;<br />    &lt;item name="upper"&gt;@drawable/ic_camera&lt;/item&gt;<br />    &lt;item name="bottom"&gt;@drawable/ic_mic&lt;/item&gt;<br />&lt;/style&gt;</pre>
<div class="zeroclipboard-container position-absolute right-0 top-0">&nbsp;</div>
</div>
</li>
<li>
<p dir="auto">Add component handler into your activity or fragment (Java):</p>
<div class="highlight highlight-source-java notranslate position-relative overflow-auto" dir="auto">
<pre>ToggleSwitchButton toggle = (ToggleSwitchButton)findViewById(R.id.toggle);<br />toggle.setOnTriggerListener(new ToggleSwitchButton.OnTriggerListener() {<br />    @Override<br />    public void toggledUp() {<br />        Toast.makeText(getApplicationContext(), "Camera Clicked", Toast.LENGTH_SHORT).show();<br />    }<br /><br />    @Override<br />    public void toggledDown() {<br />        Toast.makeText(getApplicationContext(), "Audio Clicked", Toast.LENGTH_SHORT).show();<br />    }<br />});</pre>
<div class="zeroclipboard-container position-absolute right-0 top-0">&nbsp;</div>
</div>
</li>
<li>
<p dir="auto">Add component handler into your activity or fragment (Kotlin):</p>
<div class="highlight highlight-source-java notranslate position-relative overflow-auto" dir="auto">
<pre>lateinit var toggle: ToggleSwitchButton</pre>
<pre>toggle = findViewById(R.id.toggle)<br />toggle.setOnTriggerListener(object : OnTriggerListener {<br />    override fun toggledUp() {<br />        Toast.makeText(applicationContext, "Camera Clicked", Toast.LENGTH_SHORT).show()<br />    }<br /><br />    override fun toggledDown() {<br />        Toast.makeText(applicationContext, "Audio Clicked", Toast.LENGTH_SHORT).show()<br />    }<br />})</pre>
<div class="zeroclipboard-container position-absolute right-0 top-0">&nbsp;</div>
</div>
</li>
</ol>
