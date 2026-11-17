package com.facebook.aura.tabs;

import X.AGE;
import X.AGF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0981AMm;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTabBarHostState {
    public static final int $stable = 0;
    public final C0981AMm<AuraTabRootNavKey, Registration> registrations = new C0981AMm<>();

    public final class Registration {
        public final MutableState contentDrawn$delegate;
        public final MutableState dimmed$delegate;
        public final Function0<Unit> onReselected;
        public final Object token;

        public Registration(Object obj, boolean z, Function0<Unit> function0) {
            AnonymousClass002.A1A(obj, 0, function0);
            this.token = obj;
            this.onReselected = function0;
            Boolean boolValueOf = Boolean.valueOf(z);
            AGE ageA01 = AGF.A01();
            this.dimmed$delegate = new ParcelableSnapshotMutableState(ageA01, boolValueOf);
            this.contentDrawn$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        }

        public final boolean getContentDrawn() {
            return MutableState.A0A(this.contentDrawn$delegate);
        }

        public final boolean getDimmed() {
            return MutableState.A0A(this.dimmed$delegate);
        }

        public final Function0<Unit> getOnReselected() {
            return this.onReselected;
        }

        public final Object getToken() {
            return this.token;
        }

        public final void setContentDrawn(boolean z) {
            MutableState.A09(z, this.contentDrawn$delegate);
        }

        public final void setDimmed(boolean z) {
            MutableState.A09(z, this.dimmed$delegate);
        }
    }

    public final boolean hasDrawnContent(AuraTabRootNavKey auraTabRootNavKey) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        Registration registration = this.registrations.get(auraTabRootNavKey);
        return registration != null && MutableState.A0A(registration.contentDrawn$delegate);
    }

    public final boolean isDimmed(AuraTabRootNavKey auraTabRootNavKey) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        Registration registration = this.registrations.get(auraTabRootNavKey);
        return registration != null && MutableState.A0A(registration.dimmed$delegate);
    }

    public final void onReselected(AuraTabRootNavKey auraTabRootNavKey) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        Registration registration = this.registrations.get(auraTabRootNavKey);
        if (registration == null || (function0 = registration.onReselected) == null) {
            return;
        }
        function0.invoke();
    }

    public final void onContentDrawn(AuraTabRootNavKey auraTabRootNavKey, Object obj) {
        boolean zA1a = AnonymousClass002.A1a(auraTabRootNavKey, obj);
        Registration registration = this.registrations.get(auraTabRootNavKey);
        if (registration == null || registration.token != obj) {
            return;
        }
        registration.setContentDrawn(zA1a);
    }

    public final void register(AuraTabRootNavKey auraTabRootNavKey, Object obj, boolean z, Function0<Unit> function0) {
        AnonymousClass005.A0y(auraTabRootNavKey, obj, function0);
        this.registrations.put(auraTabRootNavKey, new Registration(obj, z, function0));
    }

    public final void unregister(AuraTabRootNavKey auraTabRootNavKey, Object obj) {
        AnonymousClass003.A0u(auraTabRootNavKey, obj);
        Registration registration = this.registrations.get(auraTabRootNavKey);
        if (registration == null || registration.token != obj) {
            return;
        }
        this.registrations.remove(auraTabRootNavKey);
    }

    public final void updateDimmed(AuraTabRootNavKey auraTabRootNavKey, Object obj, boolean z) {
        AnonymousClass003.A0u(auraTabRootNavKey, obj);
        Registration registration = this.registrations.get(auraTabRootNavKey);
        if (registration == null || registration.token != obj) {
            return;
        }
        registration.setDimmed(z);
    }
}
