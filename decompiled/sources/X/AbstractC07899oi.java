package X;

import com.whatsapp.accountlinking.ipc.api.models.CreateAcUserAndRecordDisclosureOperation;
import com.whatsapp.accountlinking.ipc.api.models.CreateAcUserAndRecordDisclosureResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.GetEncryptedProfileInfoOperation;
import com.whatsapp.accountlinking.ipc.api.models.GetEncryptedProfileInfoOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.GetFeatureEligibilityOperation;
import com.whatsapp.accountlinking.ipc.api.models.GetFeatureEligibilityResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.GetRegisteredPhoneNumberOperation;
import com.whatsapp.accountlinking.ipc.api.models.GetRegisteredPhoneNumberOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.Operation;
import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.OperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.OperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.StatusApiEligibilityOperation;
import com.whatsapp.accountlinking.ipc.api.models.StatusApiEligibilityResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseOperation;
import com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetCurrentAccountStateOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetCurrentAccountStateOperationSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceStringsOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceStringsOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperationSuccess;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperationResultSuccess;
import java.util.List;

/* renamed from: X.9oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC07899oi {
    public static final C07959pz A00;
    public static final C07959pz A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.9oj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.9oj] */
    static {
        C9py c9py = new C9py();
        final C0861A6i c0861A6iA0x = C3cG.A0x(Operation.class);
        ?? r2 = new Object(c0861A6iA0x) { // from class: X.9oj
            public final List<HxE<C9uG<? extends Base>, C9hr<? extends Base>>> A00 = C3cG.A0h();
            public final C9uG<Base> A01;

            public final <T extends Base> void A00(C9uG<T> c9uG, C9hr<T> c9hr) {
                this.A00.add(C3cG.A0r(c9uG, c9hr));
            }

            public final void A01(C9py c9py2) {
                for (HxE<C9uG<? extends Base>, C9hr<? extends Base>> hxE : this.A00) {
                    C9uG<? extends Base> c9uG = hxE.first;
                    C9hr<? extends Base> c9hr = hxE.second;
                    C9uG<Base> c9uG2 = this.A01;
                    C7384Etj.A0Z(c9uG, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
                    C7384Etj.A0Z(c9hr, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    C9py.A00(c9uG2, c9uG, c9hr, c9py2);
                }
            }

            {
                this.A01 = c0861A6iA0x;
            }
        };
        C0861A6i c0861A6iA0x2 = C3cG.A0x(GetEncryptedProfileInfoOperation.class);
        F0C<C9hr<Object>>[] f0cArr = GetEncryptedProfileInfoOperation.$childSerializers;
        r2.A00(c0861A6iA0x2, C9bI.A00);
        C0861A6i c0861A6iA0x3 = C3cG.A0x(CreateAcUserAndRecordDisclosureOperation.class);
        F0C<C9hr<Object>>[] f0cArr2 = CreateAcUserAndRecordDisclosureOperation.$childSerializers;
        r2.A00(c0861A6iA0x3, C9bC.A00);
        C0861A6i c0861A6iA0x4 = C3cG.A0x(GetStatusAudienceDisplayStringOperation.class);
        GetStatusAudienceDisplayStringOperation.Companion companion = GetStatusAudienceDisplayStringOperation.Companion;
        r2.A00(c0861A6iA0x4, C8OM.A00);
        C0861A6i c0861A6iA0x5 = C3cG.A0x(GetStatusAudienceStringsOperation.class);
        GetStatusAudienceStringsOperation.Companion companion2 = GetStatusAudienceStringsOperation.Companion;
        r2.A00(c0861A6iA0x5, C8PQ.A00);
        C0861A6i c0861A6iA0x6 = C3cG.A0x(ExecuteCrosspostOperation.class);
        F0C<C9hr<Object>>[] f0cArr3 = ExecuteCrosspostOperation.$childSerializers;
        r2.A00(c0861A6iA0x6, C9oQ.A00);
        C0861A6i c0861A6iA0x7 = C3cG.A0x(GetCurrentAccountStateOperation.class);
        GetCurrentAccountStateOperation.Companion companion3 = GetCurrentAccountStateOperation.Companion;
        r2.A00(c0861A6iA0x7, C9Mu.A00);
        C0861A6i c0861A6iA0x8 = C3cG.A0x(GetNotificationCountOperation.class);
        GetNotificationCountOperation.Companion companion4 = GetNotificationCountOperation.Companion;
        r2.A00(c0861A6iA0x8, C07869jg.A00);
        C0861A6i c0861A6iA0x9 = C3cG.A0x(NotifySeamlessLinkingCompleteOperation.class);
        NotifySeamlessLinkingCompleteOperation.Companion companion5 = NotifySeamlessLinkingCompleteOperation.Companion;
        r2.A00(c0861A6iA0x9, C8PI.A00);
        C0861A6i c0861A6iA0x10 = C3cG.A0x(TriggerSilentUnpauseOperation.class);
        F0C<C9hr<Object>>[] f0cArr4 = TriggerSilentUnpauseOperation.$childSerializers;
        r2.A00(c0861A6iA0x10, C9ke.A00);
        C0861A6i c0861A6iA0x11 = C3cG.A0x(QuickSendsMessageOperation.class);
        F0C<C9hr<Object>>[] f0cArr5 = QuickSendsMessageOperation.$childSerializers;
        r2.A00(c0861A6iA0x11, C9QU.A00);
        C0861A6i c0861A6iA0x12 = C3cG.A0x(GetFeatureEligibilityOperation.class);
        F0C<C9hr<Object>>[] f0cArr6 = GetFeatureEligibilityOperation.$childSerializers;
        r2.A00(c0861A6iA0x12, C9Pz.A00);
        C0861A6i c0861A6iA0x13 = C3cG.A0x(StatusApiEligibilityOperation.class);
        F0C<C9hr<Object>>[] f0cArr7 = StatusApiEligibilityOperation.$childSerializers;
        r2.A00(c0861A6iA0x13, C9hl.A00);
        C0861A6i c0861A6iA0x14 = C3cG.A0x(GetRegisteredPhoneNumberOperation.class);
        GetRegisteredPhoneNumberOperation.Companion companion6 = GetRegisteredPhoneNumberOperation.Companion;
        r2.A00(c0861A6iA0x14, C9Mx.A00);
        r2.A01(c9py);
        A01 = c9py.A02();
        C9py c9py2 = new C9py();
        final C0861A6i c0861A6iA0x15 = C3cG.A0x(OperationResult.class);
        ?? r22 = new Object(c0861A6iA0x15) { // from class: X.9oj
            public final List<HxE<C9uG<? extends Base>, C9hr<? extends Base>>> A00 = C3cG.A0h();
            public final C9uG<Base> A01;

            public final <T extends Base> void A00(C9uG<T> c9uG, C9hr<T> c9hr) {
                this.A00.add(C3cG.A0r(c9uG, c9hr));
            }

            public final void A01(C9py c9py22) {
                for (HxE<C9uG<? extends Base>, C9hr<? extends Base>> hxE : this.A00) {
                    C9uG<? extends Base> c9uG = hxE.first;
                    C9hr<? extends Base> c9hr = hxE.second;
                    C9uG<Base> c9uG2 = this.A01;
                    C7384Etj.A0Z(c9uG, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
                    C7384Etj.A0Z(c9hr, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    C9py.A00(c9uG2, c9uG, c9hr, c9py22);
                }
            }

            {
                this.A01 = c0861A6iA0x15;
            }
        };
        C0861A6i c0861A6iA0x16 = C3cG.A0x(OperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr8 = OperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x16, C07949ow.A00);
        C0861A6i c0861A6iA0x17 = C3cG.A0x(OperationResultError.class);
        F0C<C9hr<Object>>[] f0cArr9 = OperationResultError.$childSerializers;
        r22.A00(c0861A6iA0x17, C07889od.A00);
        C0861A6i c0861A6iA0x18 = C3cG.A0x(GetEncryptedProfileInfoOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr10 = GetEncryptedProfileInfoOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x18, C9pF.A00);
        C0861A6i c0861A6iA0x19 = C3cG.A0x(CreateAcUserAndRecordDisclosureResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr11 = CreateAcUserAndRecordDisclosureResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x19, C9pI.A00);
        C0861A6i c0861A6iA0x20 = C3cG.A0x(GetStatusAudienceDisplayStringOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr12 = GetStatusAudienceDisplayStringOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x20, C9pC.A00);
        C0861A6i c0861A6iA0x21 = C3cG.A0x(GetStatusAudienceStringsOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr13 = GetStatusAudienceStringsOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x21, C9pA.A00);
        C0861A6i c0861A6iA0x22 = C3cG.A0x(ExecuteCrosspostOperationResultError.class);
        F0C<C9hr<Object>>[] f0cArr14 = ExecuteCrosspostOperationResultError.$childSerializers;
        r22.A00(c0861A6iA0x22, C07879ob.A00);
        C0861A6i c0861A6iA0x23 = C3cG.A0x(ExecuteCrosspostOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr15 = ExecuteCrosspostOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x23, C07929oq.A00);
        C0861A6i c0861A6iA0x24 = C3cG.A0x(GetCurrentAccountStateOperationSuccess.class);
        F0C<C9hr<Object>>[] f0cArr16 = GetCurrentAccountStateOperationSuccess.$childSerializers;
        r22.A00(c0861A6iA0x24, C9on.A00);
        C0861A6i c0861A6iA0x25 = C3cG.A0x(GetNotificationCountOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr17 = GetNotificationCountOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x25, C9p6.A00);
        C0861A6i c0861A6iA0x26 = C3cG.A0x(NotifySeamlessLinkingCompleteOperationSuccess.class);
        F0C<C9hr<Object>>[] f0cArr18 = NotifySeamlessLinkingCompleteOperationSuccess.$childSerializers;
        r22.A00(c0861A6iA0x26, C07919ok.A00);
        C0861A6i c0861A6iA0x27 = C3cG.A0x(TriggerSilentUnpauseResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr19 = TriggerSilentUnpauseResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x27, C07939ot.A00);
        C0861A6i c0861A6iA0x28 = C3cG.A0x(QuickSendsMessageOperationResultError.class);
        F0C<C9hr<Object>>[] f0cArr20 = QuickSendsMessageOperationResultError.$childSerializers;
        r22.A00(c0861A6iA0x28, C9oZ.A00);
        C0861A6i c0861A6iA0x29 = C3cG.A0x(QuickSendsMessageOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr21 = QuickSendsMessageOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x29, C9p3.A00);
        C0861A6i c0861A6iA0x30 = C3cG.A0x(GetFeatureEligibilityResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr22 = GetFeatureEligibilityResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x30, C9pO.A00);
        C0861A6i c0861A6iA0x31 = C3cG.A0x(StatusApiEligibilityResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr23 = StatusApiEligibilityResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x31, C9p0.A00);
        C0861A6i c0861A6iA0x32 = C3cG.A0x(GetRegisteredPhoneNumberOperationResultSuccess.class);
        F0C<C9hr<Object>>[] f0cArr24 = GetRegisteredPhoneNumberOperationResultSuccess.$childSerializers;
        r22.A00(c0861A6iA0x32, C9pP.A00);
        r22.A01(c9py2);
        A00 = c9py2.A02();
    }
}
