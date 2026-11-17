package com.facebook.aura.main.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import android.app.RemoteAction;
import android.util.Rational;
import java.util.List;

/* loaded from: classes.dex */
public final class MainWindowPipRequest {
    public static final int $stable = 8;
    public final List<RemoteAction> actions;
    public final Rational aspectRatio;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MainWindowPipRequest) {
                MainWindowPipRequest mainWindowPipRequest = (MainWindowPipRequest) obj;
                if (!C7384Etj.areEqual(this.aspectRatio, mainWindowPipRequest.aspectRatio) || !C7384Etj.areEqual(this.actions, mainWindowPipRequest.actions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MainWindowPipRequest copy$default(MainWindowPipRequest mainWindowPipRequest, Rational rational, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            rational = mainWindowPipRequest.aspectRatio;
        }
        if ((i & 2) != 0) {
            list = mainWindowPipRequest.actions;
        }
        AnonymousClass003.A0u(rational, list);
        return new MainWindowPipRequest(rational, list);
    }

    public final Rational component1() {
        return this.aspectRatio;
    }

    public final List<RemoteAction> component2() {
        return this.actions;
    }

    public final List<RemoteAction> getActions() {
        return this.actions;
    }

    public final Rational getAspectRatio() {
        return this.aspectRatio;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.actions, AnonymousClass005.A0E(this.aspectRatio));
    }

    public String toString() {
        Rational rational = this.aspectRatio;
        List<RemoteAction> list = this.actions;
        StringBuilder sb = new StringBuilder("MainWindowPipRequest(aspectRatio=");
        sb.append(rational);
        sb.append(", actions=");
        sb.append(list);
        return AnonymousClass001.A0v(")", sb);
    }

    public MainWindowPipRequest(Rational rational, List<RemoteAction> list) {
        AnonymousClass003.A0u(rational, list);
        this.aspectRatio = rational;
        this.actions = list;
    }

    public final MainWindowPipRequest copy(Rational rational, List<RemoteAction> list) {
        AnonymousClass003.A0u(rational, list);
        return new MainWindowPipRequest(rational, list);
    }

    public /* synthetic */ MainWindowPipRequest(Rational rational, List list, int i, C06H c06h) {
        this(rational, (i & 2) != 0 ? C0881AGi.A00 : list);
    }
}
