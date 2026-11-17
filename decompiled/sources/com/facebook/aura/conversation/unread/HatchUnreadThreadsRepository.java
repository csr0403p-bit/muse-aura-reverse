package com.facebook.aura.conversation.unread;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HxE;
import X.InterfaceC7549F2g;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchUnreadThreadsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _hasUnreadThreads;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.unread.HatchUnreadThreadsRepository$fetchHasUnreadThreads$2", f = "HatchUnreadThreadsRepository.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.unread.HatchUnreadThreadsRepository$fetchHasUnreadThreads$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchUnreadThreadsRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return HatchUnreadThreadsRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            Boolean bool;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchUnreadThreadsRepository$fetchHasUnreadThreads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchUnreadThreadsRepository$fetchHasUnreadThreads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchUnreadThreadsRepository$fetchHasUnreadThreads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = C60O.A06(obj).m1595executeBodylessJarvisRequestWithp3iPjrY(hatchUnreadThreadsRepository$fetchHasUnreadThreads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, JarvisPath.SessionHasUnreadThreads.INSTANCE, RequestType.GET, HatchUnreadThreadsRepository.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            boolean z = objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud;
            if (z) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            HasUnreadThreadsPayloadJson hasUnreadThreadsPayloadJson = (HasUnreadThreadsPayloadJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (hasUnreadThreadsPayloadJson != null && (bool = hasUnreadThreadsPayloadJson.has_unread_threads) != null) {
                HatchUnreadThreadsRepository.this.updateHasUnreadThreads(bool.booleanValue());
            }
            return C3cG.A0P(z);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass004.A1D(false, this._hasUnreadThreads);
    }

    public final C1BN<Boolean> hasUnreadThreads() {
        return C3Pi.A00(this._hasUnreadThreads);
    }

    public final void updateHasUnreadThreads(boolean z) {
        AnonymousClass004.A1D(z, this._hasUnreadThreads);
    }

    public final class Companion {
        public final HatchUnreadThreadsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchUnreadThreadsRepository) abstractC3358CGz.A03(HatchUnreadThreadsRepository.class, new HatchUnreadThreadsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchUnreadThreadsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this._hasUnreadThreads = AnonymousClass002.A0v(false);
    }

    public final Object fetchHasUnreadThreads(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public /* synthetic */ HatchUnreadThreadsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
