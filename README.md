<ol dir="auto">
<li>
<p dir="auto">Include the library as local library project:</p>
<div class="highlight highlight-source-groovy notranslate position-relative overflow-auto" dir="auto"><pre>compile <span class="pl-s"><span class="pl-pds">'</span>co.aenterhy:toggleswitch:1.0.0<span class="pl-pds">'</span></span></pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="compile 'co.aenterhy:toggleswitch:1.0.0'" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path d="M13.78 4.22a.75.75 0 0 1 0 1.06l-7.25 7.25a.75.75 0 0 1-1.06 0L2.22 9.28a.751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018L6 10.94l6.72-6.72a.75.75 0 0 1 1.06 0Z"></path>
</svg>
    </clipboard-copy>
  </div></div>
</li>
<li>
<p dir="auto">Add view to your layout file:</p>
<div class="highlight highlight-text-xml notranslate position-relative overflow-auto" dir="auto"><pre><span class="pl-c"><span class="pl-c">&lt;!--</span> ... <span class="pl-c">--&gt;</span></span>

&lt;<span class="pl-ent">co</span>.aenterhy.toggleswitch.ToggleSwitchButton
    <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/toggle<span class="pl-pds">"</span></span>
    <span class="pl-e">style</span>=<span class="pl-s"><span class="pl-pds">"</span>@style/ToggleSwitchButton<span class="pl-pds">"</span></span> /&gt;

<span class="pl-c"><span class="pl-c">&lt;!--</span> ... <span class="pl-c">--&gt;</span></span></pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="<!-- ... -->

<co.aenterhy.toggleswitch.ToggleSwitchButton
    android:id=&quot;@+id/toggle&quot;
    style=&quot;@style/ToggleSwitchButton&quot; />

<!-- ... -->" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path d="M13.78 4.22a.75.75 0 0 1 0 1.06l-7.25 7.25a.75.75 0 0 1-1.06 0L2.22 9.28a.751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018L6 10.94l6.72-6.72a.75.75 0 0 1 1.06 0Z"></path>
</svg>
    </clipboard-copy>
  </div></div>
</li>
<li>
<p dir="auto">Add to your <code>styles.xml</code>:</p>
<div class="highlight highlight-text-xml notranslate position-relative overflow-auto" dir="auto"><pre>&lt;<span class="pl-ent">style</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>ToggleSwitchButton<span class="pl-pds">"</span></span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>android:layout_width<span class="pl-pds">"</span></span>&gt;wrap_content&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>android:layout_height<span class="pl-pds">"</span></span>&gt;wrap_content&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>android:layout_alignParentBottom<span class="pl-pds">"</span></span>&gt;true&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>android:layout_alignParentRight<span class="pl-pds">"</span></span>&gt;true&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>outerRadius<span class="pl-pds">"</span></span>&gt;50dp&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>handleDrawable<span class="pl-pds">"</span></span>&gt;@drawable/ic_switch&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>upper<span class="pl-pds">"</span></span>&gt;@drawable/ic_camera&lt;/<span class="pl-ent">item</span>&gt;
    &lt;<span class="pl-ent">item</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>bottom<span class="pl-pds">"</span></span>&gt;@drawable/ic_audio&lt;/<span class="pl-ent">item</span>&gt;
&lt;/<span class="pl-ent">style</span>&gt;</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="
<style name=&quot;ToggleSwitchButton&quot;>
    <item name=&quot;android:layout_width&quot;>wrap_content</item>
    <item name=&quot;android:layout_height&quot;>wrap_content</item>
    <item name=&quot;android:layout_alignParentBottom&quot;>true</item>
    <item name=&quot;android:layout_alignParentRight&quot;>true</item>
    <item name=&quot;outerRadius&quot;>50dp</item>
    <item name=&quot;handleDrawable&quot;>@drawable/ic_switch</item>
    <item name=&quot;upper&quot;>@drawable/ic_camera</item>
    <item name=&quot;bottom&quot;>@drawable/ic_audio</item>
</style>" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path d="M13.78 4.22a.75.75 0 0 1 0 1.06l-7.25 7.25a.75.75 0 0 1-1.06 0L2.22 9.28a.751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018L6 10.94l6.72-6.72a.75.75 0 0 1 1.06 0Z"></path>
</svg>
    </clipboard-copy>
  </div></div>
</li>
<li>
<p dir="auto">Add component handler into your activity or fragment:</p>
<div class="highlight highlight-source-java notranslate position-relative overflow-auto" dir="auto"><pre>    <span class="pl-s1">toggle</span> = (<span class="pl-smi">ToggleSwitchButton</span>) <span class="pl-en">findViewById</span>(<span class="pl-smi">R</span>.<span class="pl-s1">id</span>.<span class="pl-s1">toggle</span>);
    <span class="pl-s1">toggle</span>.<span class="pl-en">setOnTriggerListener</span>(<span class="pl-k">new</span> <span class="pl-smi">ToggleSwitchButton</span>.<span class="pl-smi">OnTriggerListener</span>() {
        <span class="pl-c1">@</span><span class="pl-c1">Override</span>
        <span class="pl-k">public</span> <span class="pl-smi">void</span> <span class="pl-en">toggledUp</span>() {
            <span class="pl-s1">Toast</span>.<span class="pl-en">makeText</span>(<span class="pl-smi">MainActivity</span>.<span class="pl-smi">this</span>, <span class="pl-s">"Camera"</span>, <span class="pl-smi">Toast</span>.<span class="pl-c1">LENGTH_SHORT</span>).<span class="pl-en">show</span>();
        }

        <span class="pl-c1">@</span><span class="pl-c1">Override</span>
        <span class="pl-k">public</span> <span class="pl-smi">void</span> <span class="pl-en">toggledDown</span>() {
            <span class="pl-s1">Toast</span>.<span class="pl-en">makeText</span>(<span class="pl-smi">MainActivity</span>.<span class="pl-smi">this</span>, <span class="pl-s">"Audio"</span>, <span class="pl-smi">Toast</span>.<span class="pl-c1">LENGTH_SHORT</span>).<span class="pl-en">show</span>();
        }
    });</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="    toggle = (ToggleSwitchButton) findViewById(R.id.toggle);
    toggle.setOnTriggerListener(new ToggleSwitchButton.OnTriggerListener() {
        @Override
        public void toggledUp() {
            Toast.makeText(MainActivity.this, &quot;Camera&quot;, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void toggledDown() {
            Toast.makeText(MainActivity.this, &quot;Audio&quot;, Toast.LENGTH_SHORT).show();
        }
    });" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path d="M13.78 4.22a.75.75 0 0 1 0 1.06l-7.25 7.25a.75.75 0 0 1-1.06 0L2.22 9.28a.751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018L6 10.94l6.72-6.72a.75.75 0 0 1 1.06 0Z"></path>
</svg>
    </clipboard-copy>
  </div></div>
</li>
</ol>
