package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginErrorDialogAction extends C06G {
    public static final int $stable = 0;
    public final int labelRes;
    public final String url;

    public NativeLoginErrorDialogAction(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.labelRes = i;
        this.url = str;
    }

    public final NativeLoginErrorDialogAction copy(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new NativeLoginErrorDialogAction(i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginErrorDialogAction) {
                NativeLoginErrorDialogAction nativeLoginErrorDialogAction = (NativeLoginErrorDialogAction) obj;
                if (this.labelRes != nativeLoginErrorDialogAction.labelRes || !C7384Etj.areEqual(this.url, nativeLoginErrorDialogAction.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginErrorDialogAction copy$default(NativeLoginErrorDialogAction nativeLoginErrorDialogAction, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeLoginErrorDialogAction.labelRes;
        }
        if ((i2 & 2) != 0) {
            str = nativeLoginErrorDialogAction.url;
        }
        C7384Etj.A0Y(str, 1);
        return new NativeLoginErrorDialogAction(i, str);
    }

    public final int component1() {
        return this.labelRes;
    }

    public final String component2() {
        return this.url;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, this.labelRes * 31);
    }

    public String toString() {
        return super.toString();
    }
}
