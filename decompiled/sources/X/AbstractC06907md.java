package X;

import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.facebook.aura.gateway.HatchAgentExecution;
import com.facebook.aura.storagerecovery.Directory;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.7md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC06907md extends AbstractC06917me {
    public static String A02(Iterable iterable, Object obj) {
        return ((PackageItemInfo) ((ResolveInfo) AbstractC0878AGe.A0F(AbstractC0878AGe.A0c(iterable, new C7573F4m(obj, 6)))).activityInfo).packageName;
    }

    public static Directory A00(StorageRecoveryViewModel storageRecoveryViewModel) {
        List<Directory> list = storageRecoveryViewModel.directoryStack.get();
        C7384Etj.A0U(list);
        return (Directory) AbstractC0878AGe.A0I(list);
    }

    public static String A01(CharSequence charSequence, Iterable iterable, G0U g0u) {
        return AbstractC0878AGe.A0L(charSequence, "", "", iterable, g0u);
    }

    public static ArrayList A03(HatchAgentExecution hatchAgentExecution) {
        return AbstractC0878AGe.A0P(hatchAgentExecution.turns.values(), hatchAgentExecution.requests.values());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public static final <T> void A04(List<T> list, Comparator<? super T> comparator) {
        if (list.size() > C60P.A1Y(list, comparator)) {
            Collections.sort(list, comparator);
        }
    }
}
