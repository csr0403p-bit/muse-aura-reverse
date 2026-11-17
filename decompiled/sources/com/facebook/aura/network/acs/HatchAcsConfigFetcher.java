package com.facebook.aura.network.acs;

import X.A7q;
import X.A7s;
import X.A7u;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C78W;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchAcsConfigFetcher {
    public static final String TAG = "HatchAcsConfigFetcher";
    public static final HatchAcsConfigFetcher INSTANCE = new HatchAcsConfigFetcher();
    public static final C3UX scope = C78W.A03();

    @DebugMetadata(c = "com.facebook.aura.network.acs.HatchAcsConfigFetcher$getPublicParameters$1", f = "HatchAcsConfigFetcher.kt", l = {28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.acs.HatchAcsConfigFetcher$getPublicParameters$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ A7s $callback;
        public final /* synthetic */ String $projectName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, A7s a7s, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$projectName = str;
            this.$callback = a7s;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$projectName, this.$callback, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    OhaiAcsConfigRepository ohaiAcsConfigRepository = OhaiAcsConfigRepository.INSTANCE;
                    String str = this.$projectName;
                    this.label = 1;
                    obj = OhaiAcsConfigRepository.delegate.getAcsServerConfig(str, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                A7u a7u = (A7u) obj;
                A7s a7s = this.$callback;
                if (a7u != null) {
                    System.currentTimeMillis();
                    ((A7q) a7s).A01.AWN(a7u);
                } else {
                    ((A7q) a7s).A01.onFailure(C3cG.A0Q(FGI.A0M("No ACS config available for project ", this.$projectName)));
                }
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                CFK.A08(HatchAcsConfigFetcher.TAG, "Failed to resolve ACS public parameters", th);
                ((A7q) this.$callback).A01.onFailure(th);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public void getPublicParameters(String str, String str2, A7s a7s) {
        AnonymousClass003.A0v(str, a7s);
        AnonymousClass001.A1J(new AnonymousClass1(str, a7s, null), scope);
    }
}
