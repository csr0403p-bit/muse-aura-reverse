package com.facebook.aura.backgroundwork.api;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BackgroundWorkContent extends C06G {
    public final Bitmap image;
    public final boolean notifyWhenFinished;
    public final Function0<Unit> onStop;
    public final String openUri;
    public final BackgroundWorkState state;
    public final String text;
    public final String title;

    public final BackgroundWorkContent copy(String str, String str2, Bitmap bitmap, String str3, Function0<Unit> function0, BackgroundWorkState backgroundWorkState, boolean z) {
        AnonymousClass002.A1D(str, 0, backgroundWorkState);
        return new BackgroundWorkContent(str, str2, bitmap, str3, function0, backgroundWorkState, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BackgroundWorkContent) {
                BackgroundWorkContent backgroundWorkContent = (BackgroundWorkContent) obj;
                if (!C7384Etj.areEqual(this.title, backgroundWorkContent.title) || !C7384Etj.areEqual(this.text, backgroundWorkContent.text) || !C7384Etj.areEqual(this.image, backgroundWorkContent.image) || !C7384Etj.areEqual(this.openUri, backgroundWorkContent.openUri) || !C7384Etj.areEqual(this.onStop, backgroundWorkContent.onStop) || this.state != backgroundWorkContent.state || this.notifyWhenFinished != backgroundWorkContent.notifyWhenFinished) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ BackgroundWorkContent(String str, String str2, Bitmap bitmap, String str3, Function0 function0, BackgroundWorkState backgroundWorkState, boolean z, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? BackgroundWorkState.RUNNING : backgroundWorkState, C3cH.A1M(i, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackgroundWorkContent copy$default(BackgroundWorkContent backgroundWorkContent, String str, String str2, Bitmap bitmap, String str3, Function0 function0, BackgroundWorkState backgroundWorkState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backgroundWorkContent.title;
        }
        if ((i & 2) != 0) {
            str2 = backgroundWorkContent.text;
        }
        if ((i & 4) != 0) {
            bitmap = backgroundWorkContent.image;
        }
        if ((i & 8) != 0) {
            str3 = backgroundWorkContent.openUri;
        }
        if ((i & 16) != 0) {
            function0 = backgroundWorkContent.onStop;
        }
        if ((i & 32) != 0) {
            backgroundWorkState = backgroundWorkContent.state;
        }
        if ((i & 64) != 0) {
            z = backgroundWorkContent.notifyWhenFinished;
        }
        return backgroundWorkContent.copy(str, str2, bitmap, str3, function0, backgroundWorkState, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final Bitmap component3() {
        return this.image;
    }

    public final String component4() {
        return this.openUri;
    }

    public final Function0<Unit> component5() {
        return this.onStop;
    }

    public final BackgroundWorkState component6() {
        return this.state;
    }

    public final boolean component7() {
        return this.notifyWhenFinished;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final boolean getNotifyWhenFinished() {
        return this.notifyWhenFinished;
    }

    public final Function0<Unit> getOnStop() {
        return this.onStop;
    }

    public final String getOpenUri() {
        return this.openUri;
    }

    public final BackgroundWorkState getState() {
        return this.state;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.state, (((((((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass006.A0D(this.image)) * 31) + AnonymousClass006.A0G(this.openUri)) * 31) + C3cH.A02(this.onStop)) * 31), this.notifyWhenFinished);
    }

    public String toString() {
        return super.toString();
    }

    public BackgroundWorkContent(String str, String str2, Bitmap bitmap, String str3, Function0<Unit> function0, BackgroundWorkState backgroundWorkState, boolean z) {
        AnonymousClass002.A1D(str, 0, backgroundWorkState);
        this.title = str;
        this.text = str2;
        this.image = bitmap;
        this.openUri = str3;
        this.onStop = function0;
        this.state = backgroundWorkState;
        this.notifyWhenFinished = z;
    }
}
