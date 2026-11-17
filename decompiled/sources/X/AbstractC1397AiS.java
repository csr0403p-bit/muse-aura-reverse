package X;

import android.graphics.Outline;

/* renamed from: X.AiS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1397AiS {
    public static final void A00(Outline outline, InterfaceC1068ATy interfaceC1068ATy) {
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1710Aot) interfaceC1068ATy).A03);
    }
}
