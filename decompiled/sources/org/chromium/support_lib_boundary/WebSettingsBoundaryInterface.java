package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public interface WebSettingsBoundaryInterface {
    @Deprecated
    int getAttributionBehavior();

    boolean getBackForwardCacheEnabled();

    InvocationHandler getBackForwardCacheSettings();

    boolean getBackForwardCacheSettingsKeepForwardEntries();

    int getBackForwardCacheSettingsMaxPagesInCache();

    long getBackForwardCacheSettingsTimeout();

    int getDisabledActionModeMenuItems();

    boolean getDownloadFaviconsEnabled();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getHasEnrolledInstrumentEnabled();

    boolean getIncludeCookiesOnIntercept();

    boolean getOffscreenPreRaster();

    boolean getPaymentRequestEnabled();

    boolean getSafeBrowsingEnabled();

    int getSpeculativeLoadingStatus();

    Map<String, Object> getUserAgentMetadataMap();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();

    int getWebauthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z);

    @Deprecated
    void setAttributionBehavior(int i);

    void setBackForwardCacheEnabled(boolean z);

    void setBackForwardCacheSettings(InvocationHandler invocationHandler);

    void setBackForwardCacheSettingsKeepForwardEntries(boolean z);

    void setBackForwardCacheSettingsMaxPagesInCache(int i);

    void setBackForwardCacheSettingsTimeout(long j);

    void setDisabledActionModeMenuItems(int i);

    void setDownloadFaviconsEnabled(boolean z);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setHasEnrolledInstrumentEnabled(boolean z);

    void setHyperlinkContextMenuItems(int i);

    void setIncludeCookiesOnIntercept(boolean z);

    void setOffscreenPreRaster(boolean z);

    void setPaymentRequestEnabled(boolean z);

    void setSafeBrowsingEnabled(boolean z);

    void setSpeculativeLoadingStatus(int i);

    void setUserAgentMetadataFromMap(Map<String, Object> map);

    void setWebViewMediaIntegrityApiStatus(int i, Map<String, Integer> map);

    void setWebauthnSupport(int i);

    void setWillSuppressErrorPage(boolean z);
}
