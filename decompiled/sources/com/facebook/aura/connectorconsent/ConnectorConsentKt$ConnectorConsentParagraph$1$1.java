package com.facebook.aura.connectorconsent;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.C1733ApU;
import X.C7Je;
import X.G0U;
import X.G0V;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ConnectorConsentKt$ConnectorConsentParagraph$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedText;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0V<String, String, Unit> $onLinkClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorConsentKt$ConnectorConsentParagraph$1$1(ApQ apQ, G0V<? super String, ? super String, Unit> g0v, Context context) {
        super(1);
        this.$annotatedText = apQ;
        this.$onLinkClick = g0v;
        this.$context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i) {
        C1733ApU c1733ApU = (C1733ApU) AbstractC0878AGe.A0G(this.$annotatedText.A05("URL", i, i));
        if (c1733ApU != null) {
            G0V<String, String, Unit> g0v = this.$onLinkClick;
            ApQ apQ = this.$annotatedText;
            Context context = this.$context;
            T t = c1733ApU.A02;
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01((String) t);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (g0v != null) {
                String scheme = uriA01 != null ? uriA01.getScheme() : null;
                if (scheme != null && scheme.equalsIgnoreCase("https")) {
                    g0v.invoke(t, apQ.subSequence(c1733ApU.A01, c1733ApU.A00).toString());
                    return;
                }
            }
            if (uriA01 != null) {
                ConnectorConsentKt.launchConsentLink(context, uriA01);
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
