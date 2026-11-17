package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.Ab3;
import X.AbstractC1798ArH;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1T;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class EmbodimentFrameRetention {
    public static final int $stable = 8;
    public final MutableState frame$delegate = AbstractC1798ArH.A03();
    public boolean presented;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* renamed from: update-fSIHrko, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1800updatefSIHrko(boolean r2, boolean r3, boolean r4, boolean r5, X.AWA r6, kotlin.jvm.functions.Function0<? extends X.InterfaceC2178B0w> r7) {
        /*
            r1 = this;
            r0 = 5
            X.C7384Etj.A0Y(r7, r0)
            if (r3 == 0) goto L9
            r0 = 1
            r1.presented = r0
        L9:
            if (r2 == 0) goto L19
            if (r4 != 0) goto L19
            if (r5 == 0) goto L36
            X.B0w r0 = r1.getFrame()
            boolean r0 = r1.m1796matchesSizeVyH8yc(r0, r6)
            if (r0 != 0) goto L21
        L19:
            r0 = 0
            r1.setFrame(r0)
            if (r2 == 0) goto L36
            if (r5 == 0) goto L36
        L21:
            boolean r0 = r1.presented
            if (r0 == 0) goto L36
            if (r3 != 0) goto L36
            X.B0w r0 = r1.getFrame()
            if (r0 != 0) goto L36
            java.lang.Object r0 = com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt.captureEmbodimentFrame(r7)
            X.B0w r0 = (X.InterfaceC2178B0w) r0
            r1.m1799onSurfaceLostVyH8yc(r0, r6)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.EmbodimentFrameRetention.m1800updatefSIHrko(boolean, boolean, boolean, boolean, X.AWA, kotlin.jvm.functions.Function0):void");
    }

    /* renamed from: matchesSize-V-yH8yc, reason: not valid java name */
    private final boolean m1796matchesSizeVyH8yc(InterfaceC2178B0w interfaceC2178B0w, AWA awa) {
        if (awa == null) {
            return true;
        }
        if (interfaceC2178B0w == null) {
            return false;
        }
        Bitmap bitmap = ((B1T) interfaceC2178B0w).A00;
        int width = bitmap.getWidth();
        long j = awa.A00;
        return width == Ab3.A01(AnonymousClass003.A03(j)) && bitmap.getHeight() == Ab3.A01(AnonymousClass004.A00(j));
    }

    /* renamed from: onSurfaceLost-V-yH8yc$default, reason: not valid java name */
    public static /* synthetic */ void m1797onSurfaceLostVyH8yc$default(EmbodimentFrameRetention embodimentFrameRetention, InterfaceC2178B0w interfaceC2178B0w, AWA awa, int i, Object obj) {
        if ((i & 2) != 0) {
            awa = null;
        }
        embodimentFrameRetention.m1799onSurfaceLostVyH8yc(interfaceC2178B0w, awa);
    }

    private final void setFrame(InterfaceC2178B0w interfaceC2178B0w) {
        this.frame$delegate.Af8(interfaceC2178B0w);
    }

    /* renamed from: update-fSIHrko$default, reason: not valid java name */
    public static /* synthetic */ void m1798updatefSIHrko$default(EmbodimentFrameRetention embodimentFrameRetention, boolean z, boolean z2, boolean z3, boolean z4, AWA awa, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = z2;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        if ((i & 16) != 0) {
            awa = null;
        }
        embodimentFrameRetention.m1800updatefSIHrko(z, z2, z3, z4, awa, function0);
    }

    public final InterfaceC2178B0w getFrame() {
        return (InterfaceC2178B0w) this.frame$delegate.getValue();
    }

    /* renamed from: onSurfaceLost-V-yH8yc, reason: not valid java name */
    public final void m1799onSurfaceLostVyH8yc(InterfaceC2178B0w interfaceC2178B0w, AWA awa) {
        if (this.presented && interfaceC2178B0w != null && m1796matchesSizeVyH8yc(interfaceC2178B0w, awa)) {
            setFrame(interfaceC2178B0w);
        }
    }
}
