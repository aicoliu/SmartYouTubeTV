package com.liskovsoft.smartyoutubetv.flavours.webview;

import com.liskovsoft.browser.Browser;
import com.liskovsoft.browser.Browser.EngineType;
import com.liskovsoft.smartyoutubetv.SmartYouTubeTVActivityBase;

public class SmartYouTubeTVActivity extends SmartYouTubeTVActivityBase {
    public SmartYouTubeTVActivity() {
        // we must set engine type as early as possible
        Browser.setEngineType(EngineType.WebView);
    }
}