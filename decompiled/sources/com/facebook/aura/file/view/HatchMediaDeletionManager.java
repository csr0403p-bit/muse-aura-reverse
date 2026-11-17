package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C27k;
import X.C3UX;
import X.C7384Etj;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.file.repo.HatchDeletedMediaStore;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchMediaDeletionManager implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SingleFlight deleteSingleFlight;
    public final HatchDeletedMediaStore deletedStore;
    public final C3UX deletionScope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.HatchMediaDeletionManager", f = "HatchMediaDeletionManager.kt", l = {57}, m = "deleteAndReconcile", v = 2)
    /* renamed from: com.facebook.aura.file.view.HatchMediaDeletionManager$deleteAndReconcile$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMediaDeletionManager.this.deleteAndReconcile(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.HatchMediaDeletionManager$deleteMedia$1", f = "HatchMediaDeletionManager.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HatchMediaDeletionManager$deleteMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C119551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ boolean $recursive;
        public final /* synthetic */ String $relativePath;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119551(String str, boolean z, HtJ<? super C119551> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$recursive = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMediaDeletionManager.this.new C119551(this.$relativePath, this.$recursive, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zA1X;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchMediaDeletionManager hatchMediaDeletionManager = HatchMediaDeletionManager.this;
                SingleFlight singleFlight = hatchMediaDeletionManager.deleteSingleFlight;
                String str = this.$relativePath;
                boolean z = this.$recursive;
                HxE hxEA0q = AnonymousClass002.A0q(str, z);
                HatchMediaDeletionManager$deleteMedia$1$result$1 hatchMediaDeletionManager$deleteMedia$1$result$1 = new HatchMediaDeletionManager$deleteMedia$1$result$1(hatchMediaDeletionManager, str, z, null);
                this.label = 1;
                obj = singleFlight.invoke(hxEA0q, hatchMediaDeletionManager$deleteMedia$1$result$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
            if (singleFlightResult instanceof SingleFlightResult.Result) {
                zA1X = AnonymousClass001.A1X(((SingleFlightResult.Result) singleFlightResult).value);
            } else {
                if (!C7384Etj.areEqual(singleFlightResult, SingleFlightResult.Skipped.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                zA1X = false;
            }
            return Boolean.valueOf(zA1X);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C119551) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C27k<Boolean> deleteMedia(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass001.A10(new C119551(str, z, null), this.deletionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteAndReconcile(java.lang.String r7, boolean r8, X.HtJ<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HatchMediaDeletionManager.deleteAndReconcile(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.deletionScope);
        this.deleteSingleFlight.clearAndCancelAll();
    }

    public final class Companion {
        public final HatchMediaDeletionManager getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchMediaDeletionManager) abstractC3358CGz.A03(HatchMediaDeletionManager.class, new HatchMediaDeletionManager$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchMediaDeletionManager(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public HatchMediaDeletionManager(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.deletedStore = HatchDeletedMediaStore.Companion.getInstance(abstractC3358CGz);
        this.deletionScope = Hxb.A02(AnonymousClass001.A0y().plus(new C8eO(null)));
        this.deleteSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }
}
