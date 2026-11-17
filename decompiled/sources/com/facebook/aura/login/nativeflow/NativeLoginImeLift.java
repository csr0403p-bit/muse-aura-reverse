package com.facebook.aura.login.nativeflow;

import X.Ab3;
import X.AnonymousClass001;
import X.C00r;
import X.C1110AYw;
import X.C7384Etj;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes.dex */
public final class NativeLoginImeLift {
    public static final int $stable = 0;
    public final C00r anchorBottomInContent$delegate;
    public volatile InterfaceC1497Ak4 anchorCoordinates;
    public final C00r anchorHeight$delegate;
    public volatile InterfaceC1497Ak4 contentCoordinates;
    public final C00r pageTopInWindow$delegate;
    public final C00r pinnedAboveImeHeight$delegate;
    public final C1110AYw state;

    public NativeLoginImeLift(C1110AYw c1110AYw) {
        C7384Etj.A0Y(c1110AYw, 0);
        this.state = c1110AYw;
        this.pageTopInWindow$delegate = new ParcelableSnapshotMutableIntState(Integer.MIN_VALUE);
        this.anchorBottomInContent$delegate = new ParcelableSnapshotMutableIntState(Integer.MIN_VALUE);
        this.anchorHeight$delegate = new ParcelableSnapshotMutableIntState(0);
        this.pinnedAboveImeHeight$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    public final int getAnchorBottomInContent$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return this.anchorBottomInContent$delegate.AGd();
    }

    public final InterfaceC1497Ak4 getAnchorCoordinates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return this.anchorCoordinates;
    }

    public final int getAnchorHeight$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return this.anchorHeight$delegate.AGd();
    }

    public final InterfaceC1497Ak4 getContentCoordinates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return this.contentCoordinates;
    }

    public final int getPageTopInWindow$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return this.pageTopInWindow$delegate.AGd();
    }

    public final int getPinnedAboveImeHeight$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return this.pinnedAboveImeHeight$delegate.AGd();
    }

    public final C1110AYw getState() {
        return this.state;
    }

    public final void measureAnchor$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        InterfaceC1497Ak4 interfaceC1497Ak4;
        InterfaceC1497Ak4 interfaceC1497Ak42 = this.contentCoordinates;
        if (interfaceC1497Ak42 == null || (interfaceC1497Ak4 = this.anchorCoordinates) == null || !interfaceC1497Ak42.isAttached() || !interfaceC1497Ak4.isAttached()) {
            return;
        }
        setAnchorHeight$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow((int) (interfaceC1497Ak4.AKd() & 4294967295L));
        setAnchorBottomInContent$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(Ab3.A01(AnonymousClass001.A01(interfaceC1497Ak42.APm(interfaceC1497Ak4, 0L), 4294967295L)) + this.anchorHeight$delegate.AGd());
    }

    public final void setAnchorBottomInContent$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(int i) {
        this.anchorBottomInContent$delegate.AdX(i);
    }

    public final void setAnchorHeight$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(int i) {
        this.anchorHeight$delegate.AdX(i);
    }

    public final void setPageTopInWindow$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(int i) {
        this.pageTopInWindow$delegate.AdX(i);
    }

    public final void setPinnedAboveImeHeight$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(int i) {
        this.pinnedAboveImeHeight$delegate.AdX(i);
    }

    public final void setAnchorCoordinates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.anchorCoordinates = interfaceC1497Ak4;
    }

    public final void setContentCoordinates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.contentCoordinates = interfaceC1497Ak4;
    }
}
