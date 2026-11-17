package com.facebook.aura.assist;

import X.AaC;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BO;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistIdentityPresentation extends C06G {
    public static final int $stable = 0;
    public final C1BO<AaC> bounds;
    public final boolean isVoice;
    public final Function0<Unit> onOpenApp;
    public final boolean showingVoice;
    public final String threadId;
    public final boolean visible;
    public final long windowOrigin;

    /* renamed from: copy-712uMfE, reason: not valid java name */
    public final AssistIdentityPresentation m262copy712uMfE(boolean z, boolean z2, C1BO<AaC> c1bo, long j, String str, Function0<Unit> function0, boolean z3) {
        AnonymousClass002.A1D(c1bo, 2, function0);
        return new AssistIdentityPresentation(z, z2, c1bo, j, str, function0, z3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AssistIdentityPresentation) {
                AssistIdentityPresentation assistIdentityPresentation = (AssistIdentityPresentation) obj;
                if (this.isVoice != assistIdentityPresentation.isVoice || this.showingVoice != assistIdentityPresentation.showingVoice || !C7384Etj.areEqual(this.bounds, assistIdentityPresentation.bounds) || this.windowOrigin != assistIdentityPresentation.windowOrigin || !C7384Etj.areEqual(this.threadId, assistIdentityPresentation.threadId) || !C7384Etj.areEqual(this.onOpenApp, assistIdentityPresentation.onOpenApp) || this.visible != assistIdentityPresentation.visible) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-712uMfE$default, reason: not valid java name */
    public static /* synthetic */ AssistIdentityPresentation m260copy712uMfE$default(AssistIdentityPresentation assistIdentityPresentation, boolean z, boolean z2, C1BO c1bo, long j, String str, Function0 function0, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = assistIdentityPresentation.isVoice;
        }
        if ((i & 2) != 0) {
            z2 = assistIdentityPresentation.showingVoice;
        }
        if ((i & 4) != 0) {
            c1bo = assistIdentityPresentation.bounds;
        }
        if ((i & 8) != 0) {
            j = assistIdentityPresentation.windowOrigin;
        }
        if ((i & 16) != 0) {
            str = assistIdentityPresentation.threadId;
        }
        if ((i & 32) != 0) {
            function0 = assistIdentityPresentation.onOpenApp;
        }
        if ((i & 64) != 0) {
            z3 = assistIdentityPresentation.visible;
        }
        return assistIdentityPresentation.m262copy712uMfE(z, z2, c1bo, j, str, function0, z3);
    }

    public final boolean component1() {
        return this.isVoice;
    }

    public final boolean component2() {
        return this.showingVoice;
    }

    public final C1BO<AaC> component3() {
        return this.bounds;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m261component4F1C5BW0() {
        return this.windowOrigin;
    }

    public final String component5() {
        return this.threadId;
    }

    public final Function0<Unit> component6() {
        return this.onOpenApp;
    }

    public final boolean component7() {
        return this.visible;
    }

    public final C1BO<AaC> getBounds() {
        return this.bounds;
    }

    public final Function0<Unit> getOnOpenApp() {
        return this.onOpenApp;
    }

    public final boolean getShowingVoice() {
        return this.showingVoice;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: getWindowOrigin-F1C5BW0, reason: not valid java name */
    public final long m263getWindowOriginF1C5BW0() {
        return this.windowOrigin;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.onOpenApp, ((AnonymousClass006.A05(this.windowOrigin, AnonymousClass005.A0F(this.bounds, C0KA.A01(C0KA.A02(this.isVoice), this.showingVoice))) * 31) + AnonymousClass006.A0G(this.threadId)) * 31), this.visible);
    }

    public final boolean isVoice() {
        return this.isVoice;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AssistIdentityPresentation(boolean z, boolean z2, C1BO c1bo, long j, String str, Function0 function0, boolean z3, C06H c06h) {
        this(z, z2, c1bo, j, str, function0, z3);
    }

    public AssistIdentityPresentation(boolean z, boolean z2, C1BO<AaC> c1bo, long j, String str, Function0<Unit> function0, boolean z3) {
        AnonymousClass002.A1D(c1bo, 2, function0);
        this.isVoice = z;
        this.showingVoice = z2;
        this.bounds = c1bo;
        this.windowOrigin = j;
        this.threadId = str;
        this.onOpenApp = function0;
        this.visible = z3;
    }
}
