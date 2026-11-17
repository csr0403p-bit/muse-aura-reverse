package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginErrorDialogContent extends C06G {
    public static final int $stable = 0;
    public final NativeLoginErrorDialogAction action;
    public final NativeLoginErrorDismissal dismissal;
    public final int messageRes;
    public final String serverMessage;
    public final String serverTitle;
    public final int titleRes;

    public NativeLoginErrorDialogContent(int i, int i2, String str, String str2, NativeLoginErrorDialogAction nativeLoginErrorDialogAction, NativeLoginErrorDismissal nativeLoginErrorDismissal) {
        C7384Etj.A0Y(nativeLoginErrorDismissal, 5);
        this.titleRes = i;
        this.messageRes = i2;
        this.serverTitle = str;
        this.serverMessage = str2;
        this.action = nativeLoginErrorDialogAction;
        this.dismissal = nativeLoginErrorDismissal;
    }

    public final NativeLoginErrorDialogContent copy(int i, int i2, String str, String str2, NativeLoginErrorDialogAction nativeLoginErrorDialogAction, NativeLoginErrorDismissal nativeLoginErrorDismissal) {
        C7384Etj.A0Y(nativeLoginErrorDismissal, 5);
        return new NativeLoginErrorDialogContent(i, i2, str, str2, nativeLoginErrorDialogAction, nativeLoginErrorDismissal);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginErrorDialogContent) {
                NativeLoginErrorDialogContent nativeLoginErrorDialogContent = (NativeLoginErrorDialogContent) obj;
                if (this.titleRes != nativeLoginErrorDialogContent.titleRes || this.messageRes != nativeLoginErrorDialogContent.messageRes || !C7384Etj.areEqual(this.serverTitle, nativeLoginErrorDialogContent.serverTitle) || !C7384Etj.areEqual(this.serverMessage, nativeLoginErrorDialogContent.serverMessage) || !C7384Etj.areEqual(this.action, nativeLoginErrorDialogContent.action) || this.dismissal != nativeLoginErrorDialogContent.dismissal) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginErrorDialogContent copy$default(NativeLoginErrorDialogContent nativeLoginErrorDialogContent, int i, int i2, String str, String str2, NativeLoginErrorDialogAction nativeLoginErrorDialogAction, NativeLoginErrorDismissal nativeLoginErrorDismissal, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nativeLoginErrorDialogContent.titleRes;
        }
        if ((i3 & 2) != 0) {
            i2 = nativeLoginErrorDialogContent.messageRes;
        }
        if ((i3 & 4) != 0) {
            str = nativeLoginErrorDialogContent.serverTitle;
        }
        if ((i3 & 8) != 0) {
            str2 = nativeLoginErrorDialogContent.serverMessage;
        }
        if ((i3 & 16) != 0) {
            nativeLoginErrorDialogAction = nativeLoginErrorDialogContent.action;
        }
        if ((i3 & 32) != 0) {
            nativeLoginErrorDismissal = nativeLoginErrorDialogContent.dismissal;
        }
        return nativeLoginErrorDialogContent.copy(i, i2, str, str2, nativeLoginErrorDialogAction, nativeLoginErrorDismissal);
    }

    public final int component1() {
        return this.titleRes;
    }

    public final int component2() {
        return this.messageRes;
    }

    public final String component3() {
        return this.serverTitle;
    }

    public final String component4() {
        return this.serverMessage;
    }

    public final NativeLoginErrorDialogAction component5() {
        return this.action;
    }

    public final NativeLoginErrorDismissal component6() {
        return this.dismissal;
    }

    public final NativeLoginErrorDialogAction getAction() {
        return this.action;
    }

    public final NativeLoginErrorDismissal getDismissal() {
        return this.dismissal;
    }

    public final int getMessageRes() {
        return this.messageRes;
    }

    public final String getServerMessage() {
        return this.serverMessage;
    }

    public final String getServerTitle() {
        return this.serverTitle;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.dismissal, ((((((((this.titleRes * 31) + this.messageRes) * 31) + AnonymousClass006.A0G(this.serverTitle)) * 31) + AnonymousClass006.A0G(this.serverMessage)) * 31) + C06G.A04(this.action)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginErrorDialogContent(int i, int i2, String str, String str2, NativeLoginErrorDialogAction nativeLoginErrorDialogAction, NativeLoginErrorDismissal nativeLoginErrorDismissal, int i3, C06H c06h) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : nativeLoginErrorDialogAction, (i3 & 32) != 0 ? NativeLoginErrorDismissal.CLOSE : nativeLoginErrorDismissal);
    }
}
