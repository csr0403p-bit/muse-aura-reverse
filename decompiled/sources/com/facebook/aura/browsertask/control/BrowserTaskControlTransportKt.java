package com.facebook.aura.browsertask.control;

import X.AbstractC2159Azp;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.browsertask.control.BrowserTaskControlJarvisPath;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes2.dex */
public abstract class BrowserTaskControlTransportKt {
    public static final String encodeBrowserTaskId(String str) throws UnsupportedEncodingException {
        C7384Etj.A0Y(str, 0);
        String strEncode = URLEncoder.encode(str, HatchWebPageParserKt.UTF_8);
        C7384Etj.A0U(strEncode);
        return AbstractC2159Azp.A0z(strEncode, "+", "%20");
    }

    public static final JarvisPath browserTaskEndpoint(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new BrowserTaskControlJarvisPath.BrowserTask(encodeBrowserTaskId(str), str2);
    }
}
