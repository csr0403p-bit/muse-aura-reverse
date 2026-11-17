package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$2$accepted$1", f = "HatchClientRuntimeStatePublisher.kt", l = {63}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchClientRuntimeStatePublisher$publish$2$accepted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ boolean $foreground;
    public int label;
    public final /* synthetic */ HatchClientRuntimeStatePublisher this$0;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$2$accepted$1$1", f = "HatchClientRuntimeStatePublisher.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$publish$2$accepted$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ boolean $foreground;
        public int label;
        public final /* synthetic */ HatchClientRuntimeStatePublisher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchClientRuntimeStatePublisher hatchClientRuntimeStatePublisher, boolean z, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = hatchClientRuntimeStatePublisher;
            this.$foreground = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$foreground, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zA1X;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    G0V<HatchClientRuntimeStateRequestJson, HtJ<? super Boolean>, Object> g0v = this.this$0.send;
                    HatchClientRuntimeStateRequestJson hatchClientRuntimeStateRequestJson = new HatchClientRuntimeStateRequestJson(this.$foreground ? "foreground" : "background");
                    this.label = 1;
                    obj = g0v.invoke(hatchClientRuntimeStateRequestJson, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                zA1X = AnonymousClass001.A1X(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0H(HatchClientRuntimeStatePublisher.TAG, "Client visibility request failed: %s", e2.getClass().getSimpleName());
                zA1X = false;
            }
            return Boolean.valueOf(zA1X);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchClientRuntimeStatePublisher$publish$2$accepted$1(HatchClientRuntimeStatePublisher hatchClientRuntimeStatePublisher, boolean z, HtJ<? super HatchClientRuntimeStatePublisher$publish$2$accepted$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchClientRuntimeStatePublisher;
        this.$foreground = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchClientRuntimeStatePublisher$publish$2$accepted$1(this.this$0, this.$foreground, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$foreground, null);
            this.label = 1;
            obj = GAX.A01(this, anonymousClass1, 10000L);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Boolean.valueOf(C7384Etj.areEqual(obj, true));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchClientRuntimeStatePublisher$publish$2$accepted$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
