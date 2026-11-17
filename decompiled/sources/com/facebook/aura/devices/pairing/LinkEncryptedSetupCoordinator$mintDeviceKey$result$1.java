package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.devices.token.LinkDeviceKeyTarget;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$result$1", f = "LinkEncryptedSetupCoordinator.kt", l = {515}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$mintDeviceKey$result$1 extends AbstractC07127nr implements G0U<HtJ<? super LinkDeviceKeyMintResult>, Object> {
    public final /* synthetic */ LinkDeviceKeyProvisioning $provisioning;
    public final /* synthetic */ LinkEncryptedSetupSnapshot $snapshot;
    public final /* synthetic */ LinkDeviceKeyTarget $target;
    public int label;
    public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$result$1$1", f = "LinkEncryptedSetupCoordinator.kt", l = {521}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<LinkDeviceKeyRecord, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ LinkEncryptedSetupSnapshot $snapshot;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = linkEncryptedSetupCoordinator;
            this.$snapshot = linkEncryptedSetupSnapshot;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$snapshot, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0V<LinkDeviceKeyRecord, HtJ<? super Boolean>, Object> g0v = this.this$0.onDeviceKeyReplacementRequired;
                this.L$0 = null;
                this.label = 1;
                obj = g0v.invoke(obj2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Boolean.valueOf(AnonymousClass001.A1X(obj) && this.this$0.isCurrent(this.$snapshot) && this.this$0.transport.hasEncryptedPairingSession(this.$snapshot.setup.session));
        }

        @Override // X.G0V
        public final Object invoke(LinkDeviceKeyRecord linkDeviceKeyRecord, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(linkDeviceKeyRecord, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkEncryptedSetupCoordinator$mintDeviceKey$result$1(LinkDeviceKeyProvisioning linkDeviceKeyProvisioning, LinkDeviceKeyTarget linkDeviceKeyTarget, LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, HtJ<? super LinkEncryptedSetupCoordinator$mintDeviceKey$result$1> htJ) {
        super(1, htJ);
        this.$provisioning = linkDeviceKeyProvisioning;
        this.$target = linkDeviceKeyTarget;
        this.$snapshot = linkEncryptedSetupSnapshot;
        this.this$0 = linkEncryptedSetupCoordinator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkEncryptedSetupCoordinator$mintDeviceKey$result$1(this.$provisioning, this.$target, this.$snapshot, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LinkDeviceKeyProvisioning linkDeviceKeyProvisioning = this.$provisioning;
            LinkDeviceKeyTarget linkDeviceKeyTarget = this.$target;
            LinkEncryptedSetup linkEncryptedSetup = this.$snapshot.setup;
            LinkDeviceInfo linkDeviceInfo = linkEncryptedSetup.deviceInfo;
            boolean z = linkEncryptedSetup.session.isCommunity;
            Set<String> setA0g = AbstractC0878AGe.A0g(this.this$0.mintedDeviceKeyIds);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$snapshot, null);
            this.label = 1;
            obj = linkDeviceKeyProvisioning.mintKey(linkDeviceKeyTarget, linkDeviceInfo, z, setA0g, anonymousClass1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super LinkDeviceKeyMintResult> htJ) {
        return ((LinkEncryptedSetupCoordinator$mintDeviceKey$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
