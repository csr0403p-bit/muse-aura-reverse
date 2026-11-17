package X;

import com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo;
import com.facebook.aura.onboarding.OnboardingCompletionRepository;
import com.facebook.aura.onboarding.OnboardingIdentityRepository;
import com.facebook.aura.onboarding.OnboardingTasksRepository;
import com.facebook.aura.vds.compose.profilepicture.AuraImageUtils;
import java.util.Locale;

/* renamed from: X.60T, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60T {
    public static Object A00(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        switch (i & 16383) {
            case 0:
                return Locale.getDefault();
            case 1:
                return new C7Of();
            case 2:
                return new AuraImageUtils();
            case 3:
                return new OnboardingAssetPrefetchRepo();
            case 4:
                return new OnboardingCompletionRepository();
            case 5:
                return new OnboardingIdentityRepository();
            case 6:
                return new OnboardingTasksRepository();
            case 7:
                return new C7lJ();
            case 8:
                return new HzT();
            case 9:
                return new C7nN();
            case 10:
                return C5246DeB.A00(32779);
            case 11:
                return new C7nP();
            case 12:
                return new C7oD();
            case 13:
                return new C7oE();
            case 14:
                return new C7oK();
            default:
                throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
