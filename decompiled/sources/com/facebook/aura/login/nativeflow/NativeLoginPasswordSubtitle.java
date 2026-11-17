package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginPasswordSubtitle extends C06G {
    public static final int $stable = 0;
    public final NativeLoginPasswordSubtitleArgs args;
    public final int textRes;

    public NativeLoginPasswordSubtitle(int i, NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs) {
        C7384Etj.A0Y(nativeLoginPasswordSubtitleArgs, 1);
        this.textRes = i;
        this.args = nativeLoginPasswordSubtitleArgs;
    }

    public final NativeLoginPasswordSubtitle copy(int i, NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs) {
        C7384Etj.A0Y(nativeLoginPasswordSubtitleArgs, 1);
        return new NativeLoginPasswordSubtitle(i, nativeLoginPasswordSubtitleArgs);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginPasswordSubtitle) {
                NativeLoginPasswordSubtitle nativeLoginPasswordSubtitle = (NativeLoginPasswordSubtitle) obj;
                if (this.textRes != nativeLoginPasswordSubtitle.textRes || this.args != nativeLoginPasswordSubtitle.args) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginPasswordSubtitle copy$default(NativeLoginPasswordSubtitle nativeLoginPasswordSubtitle, int i, NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeLoginPasswordSubtitle.textRes;
        }
        if ((i2 & 2) != 0) {
            nativeLoginPasswordSubtitleArgs = nativeLoginPasswordSubtitle.args;
        }
        C7384Etj.A0Y(nativeLoginPasswordSubtitleArgs, 1);
        return new NativeLoginPasswordSubtitle(i, nativeLoginPasswordSubtitleArgs);
    }

    public final int component1() {
        return this.textRes;
    }

    public final NativeLoginPasswordSubtitleArgs component2() {
        return this.args;
    }

    public final NativeLoginPasswordSubtitleArgs getArgs() {
        return this.args;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.args, this.textRes * 31);
    }

    public String toString() {
        return super.toString();
    }
}
