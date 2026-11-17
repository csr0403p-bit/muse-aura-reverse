package X;

import com.facebook.aura.user.repo.AuraUserRepositoryKt;
import com.whatsapp.accountlinking.ipc.api.models.OperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.StatusApiEligibilityOperation;
import com.whatsapp.accountlinking.ipc.api.models.StatusApiEligibilityResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.StatusApiFeature;
import com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseOperation;
import com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.UseCase;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetCurrentAccountStateOperationSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceStringsOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperationSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperationResultSuccess;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonLiteralSerializer;
import kotlinx.serialization.json.JsonNullSerializer;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

/* renamed from: X.BSd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2277BSd implements Ht9, Function0 {
    public final int $t;

    public C2277BSd(int i) {
        this.$t = i;
    }

    public static F0C A00(Integer num, int i) {
        return AbstractC5321DgF.A02(num, new C2277BSd(i));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, X.9hr] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.A64] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, X.9hr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.9uO] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, X.9iZ] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, X.9iZ] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, X.9iZ] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, X.9iZ] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.9iZ] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, X.9hr] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, X.9hr] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v44, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v52, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v56, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, X.9iQ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.9iQ] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        switch (this.$t) {
            case 0:
                F0C<C9hr<Object>>[] f0cArr = OperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 1:
                F0C<C9hr<Object>>[] f0cArr2 = StatusApiEligibilityOperation.$childSerializers;
                return AnonymousClass001.A12(StatusApiFeature.A00);
            case 2:
                F0C<C9hr<Object>>[] f0cArr3 = StatusApiEligibilityResultSuccess.$childSerializers;
                return C9iL.A00();
            case 3:
                return C9iL.A02("com.whatsapp.accountlinking.ipc.api.models.StatusApiFeature", StatusApiFeature.values(), new String[]{"ig_reel_inline_playback"}, new Annotation[][]{null});
            case 4:
                F0C<C9hr<Object>>[] f0cArr4 = TriggerSilentUnpauseOperation.$childSerializers;
                return AnonymousClass001.A12(C9ki.A00);
            case 5:
                return C9iL.A02("com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseOperation.Trigger", C9ki.values(), new String[]{AuraUserRepositoryKt.RESOLUTION_MODE_BLOCKING, AuraUserRepositoryKt.RESOLUTION_MODE_NON_BLOCKING}, new Annotation[][]{null, null});
            case 6:
                F0C<C9hr<Object>>[] f0cArr5 = TriggerSilentUnpauseResultSuccess.$childSerializers;
                return C9iL.A00();
            case 7:
                return C9iL.A02("com.whatsapp.accountlinking.ipc.api.models.UseCase", UseCase.values(), new String[]{"FOA_NTA", "LINKING"}, new Annotation[][]{null, null});
            case 8:
            case 9:
                F0C<C9hr<Object>>[] f0cArr6 = ExecuteCrosspostOperation.$childSerializers;
                break;
            case 10:
                F0C<C9hr<Object>>[] f0cArr7 = ExecuteCrosspostOperationResultError.$childSerializers;
                return C9iL.A00();
            case 11:
                return ExecuteCrosspostOperationResultError._childSerializers$_anonymous_$0();
            case 12:
                F0C<C9hr<Object>>[] f0cArr8 = ExecuteCrosspostOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 13:
                F0C<C9hr<Object>>[] f0cArr9 = GetCurrentAccountStateOperationSuccess.$childSerializers;
                return C9iL.A00();
            case 14:
                F0C<C9hr<Object>>[] f0cArr10 = GetNotificationCountOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 15:
                F0C<C9hr<Object>>[] f0cArr11 = GetStatusAudienceDisplayStringOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 16:
                F0C<C9hr<Object>>[] f0cArr12 = GetStatusAudienceStringsOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 17:
                F0C<C9hr<Object>>[] f0cArr13 = NotifySeamlessLinkingCompleteOperationSuccess.$childSerializers;
                return C9iL.A00();
            case 18:
                F0C<C9hr<Object>>[] f0cArr14 = QuickSendsMessageOperation.$childSerializers;
                break;
            case 19:
                F0C<C9hr<Object>>[] f0cArr15 = QuickSendsMessageOperationResultError.$childSerializers;
                return C9iL.A00();
            case 20:
                return QuickSendsMessageOperationResultError._childSerializers$_anonymous_$0();
            case 21:
                F0C<C9hr<Object>>[] f0cArr16 = QuickSendsMessageOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 22:
                return new C9uO();
            case 23:
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                return JsonPrimitiveSerializer.A00;
            case 24:
                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.A00;
                return JsonNullSerializer.A00;
            case 25:
                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.A00;
                return JsonLiteralSerializer.A00;
            case 26:
                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.A00;
                return JsonObjectSerializer.A00;
            case 27:
                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.A00;
                return JsonArraySerializer.A00;
            default:
                return null;
        }
        return AnonymousClass001.A13();
    }
}
