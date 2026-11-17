package com.facebook.aura.iap.iac;

import X.A6I;
import X.AbstractC1720Ap8;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.Ap6;
import X.ApF;
import X.B1U;
import X.BFM;
import X.BOD;
import X.C10543Hqv;
import X.C1HY;
import X.C3cG;
import X.C7384Etj;
import X.F1F;
import X.G0V;
import X.G0W;
import X.Hon;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.ext.ViewExtKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraIacBottomSheetLauncher {
    public static final int $stable = 0;

    /* renamed from: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncher$show$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<String, Integer, Integer, Unit> $finish;
        public final /* synthetic */ String $quoteId;
        public final /* synthetic */ Hon $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Hon hon, String str, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
            super(2);
            this.$session = hon;
            this.$quoteId = str;
            this.$finish = g0w;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraIacBottomSheetLauncherKt.IacSandboxSheet(this.$session, this.$quoteId, this.$finish, bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, android.view.View, androidx.compose.ui.platform.ComposeView] */
    public void show(Activity activity, String str, String str2, String str3, Hon hon, String str4, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
        AnonymousClass002.A1C(activity, 0, hon);
        C7384Etj.A0Y(g0w, 6);
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (activity.isFinishing() || activity.isDestroyed() || viewGroup == null) {
            AnonymousClass001.A1G(AuraIacBottomSheetLauncherKt.USER_CANCELLED_WIRE_VALUE, 2592000, g0w, 120);
            return;
        }
        ensureViewTreeOwners(activity, viewGroup);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        F1F f1f = new F1F();
        final AuraIacBottomSheetLauncher$show$deliver$1 auraIacBottomSheetLauncher$show$deliver$1 = new AuraIacBottomSheetLauncher$show$deliver$1(f1f, g0w);
        ?? AuraComposeView = ViewExtKt.auraComposeView(activity, AuraThemeMode.DEFAULT, ApF.A00, null, B1U.A02(new AnonymousClass1(hon, str4, new AuraIacBottomSheetLauncher$show$finish$1(f1f, auraIacBottomSheetLauncher$show$deliver$1, c10543HqvA0z, viewGroup)), 1858930354));
        c10543HqvA0z.element = AuraComposeView;
        AuraComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncher.show.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AnonymousClass001.A1G(AuraIacBottomSheetLauncherKt.USER_CANCELLED_WIRE_VALUE, 2592000, auraIacBottomSheetLauncher$show$deliver$1, 120);
            }
        });
        viewGroup.addView((View) c10543HqvA0z.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ensureViewTreeOwners(Activity activity, ViewGroup viewGroup) {
        if (AbstractC1720Ap8.A00(viewGroup) == null && (activity instanceof C1HY)) {
            AbstractC1720Ap8.A01(viewGroup, (C1HY) activity);
        }
        if (ViewTreeViewModelStoreOwner.A00(viewGroup) == null && (activity instanceof BOD)) {
            C7384Etj.A0Y(viewGroup, 0);
            viewGroup.setTag(R.id.view_tree_view_model_store_owner, activity);
        }
        if (Ap6.A00(viewGroup) == null && (activity instanceof A6I)) {
            C7384Etj.A0Y(viewGroup, 0);
            viewGroup.setTag(R.id.view_tree_saved_state_registry_owner, (A6I) activity);
        }
    }
}
