package X;

import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.subscription.model.CheckoutNotice;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Deprecated;

/* loaded from: classes4.dex */
public abstract class AEs {
    public final C0870AEt impl;

    @Deprecated(level = Hs1.A03, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ AEs(Closeable... closeableArr) {
        C7384Etj.A0Y(closeableArr, 0);
        this.impl = new C0870AEt((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }

    public static boolean A02(AuraBuyCreditsViewModel.UiState uiState, CheckoutNotice checkoutNotice, Object obj, BLG blg, boolean z) {
        return blg.A6e(obj, uiState.copy(uiState.isLoading, uiState.products, uiState.error, z, checkoutNotice, uiState.disclaimer, uiState.nameCollection, uiState.ctaLabel));
    }

    @Deprecated(level = Hs1.A03, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        C7384Etj.A0Y(closeable, 0);
        C0870AEt c0870AEt = this.impl;
        if (c0870AEt != null) {
            c0870AEt.A01(closeable);
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        C7384Etj.A0Y(str, 0);
        C0870AEt c0870AEt = this.impl;
        if (c0870AEt == null) {
            return null;
        }
        synchronized (c0870AEt.A00) {
            t = (T) c0870AEt.A01.get(str);
        }
        return t;
    }

    public static VoiceSettingsListViewModel.UiState A00(VoiceSettingsListViewModel voiceSettingsListViewModel) {
        return voiceSettingsListViewModel._uiState.getValue();
    }

    public static ShoppingProductDetailsUiState A01(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel) {
        return shoppingProductDetailsViewModel._uiState.getValue();
    }

    public final void clear$lifecycle_viewmodel() {
        C0870AEt c0870AEt = this.impl;
        if (c0870AEt != null && !c0870AEt.A03) {
            c0870AEt.A03 = true;
            synchronized (c0870AEt.A00) {
                Iterator<AutoCloseable> it = c0870AEt.A01.values().iterator();
                while (it.hasNext()) {
                    C0870AEt.A00(it.next());
                }
                Set<AutoCloseable> set = c0870AEt.A02;
                Iterator<AutoCloseable> it2 = set.iterator();
                while (it2.hasNext()) {
                    C0870AEt.A00(it2.next());
                }
                set.clear();
            }
        }
        onCleared();
    }

    public void onCleared() {
    }

    public AEs(C3UX c3ux, AutoCloseable... autoCloseableArr) {
        AnonymousClass003.A0u(c3ux, autoCloseableArr);
        this.impl = new C0870AEt(c3ux, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(autoCloseable, 1);
        C0870AEt c0870AEt = this.impl;
        if (c0870AEt != null) {
            c0870AEt.A02(str, autoCloseable);
        }
    }

    public AEs(AutoCloseable... autoCloseableArr) {
        C7384Etj.A0Y(autoCloseableArr, 0);
        this.impl = new C0870AEt((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        C7384Etj.A0Y(autoCloseable, 0);
        C0870AEt c0870AEt = this.impl;
        if (c0870AEt != null) {
            c0870AEt.A01(autoCloseable);
        }
    }

    public AEs(C3UX c3ux) {
        C7384Etj.A0Y(c3ux, 0);
        this.impl = new C0870AEt(c3ux);
    }

    public AEs() {
        this.impl = new C0870AEt();
    }
}
