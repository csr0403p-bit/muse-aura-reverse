package com.facebook.aura.spaces.preload;

import X.AbstractC2159Azp;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes3.dex */
public abstract class SavedSpaceWebSessionKt {
    public static final String SAVED_SPACE_DOCUMENT_URL = "https://muse.ai/";
    public static final String SAVED_SPACE_VIEWER_CACHE_PREFIX = "saved-space:";

    public static final String savedSpaceFrameDocument(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0U("<!doctype html><html><head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1,viewport-fit=cover\"><style>html,body{margin:0;height:100%;overflow:hidden;background:transparent}iframe{position:fixed;inset:0;width:100%;height:100%;border:0}</style></head><body><iframe src=\"", AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, "&", "&amp;"), "\"", "&quot;"), "'", "&#39;"), "<", "&lt;"), ">", "&gt;"), "\" allow=\"autoplay; fullscreen; clipboard-write; screen-wake-lock\"></iframe></body></html>");
    }
}
