package com.facebook.aura.messenger.skills.read.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.messenger.skills.read.model.PinError;
import com.facebook.aura.messenger.skills.read.repo.MessengerReadJarvisPath;
import com.facebook.aura.messenger.skills.read.repo.PinUnlockResult;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class MessengerReadSkillRepository {

    @DebugMetadata(c = "com.facebook.aura.messenger.skills.read.repo.MessengerReadSkillRepository$getPinStatus$2", f = "MessengerReadSkillRepository.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.messenger.skills.read.repo.MessengerReadSkillRepository$getPinStatus$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                MessengerReadSkillRepository$getPinStatus$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 messengerReadSkillRepository$getPinStatus$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = MessengerReadSkillRepository$getPinStatus$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(messengerReadSkillRepository$getPinStatus$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, MessengerReadJarvisPath.MessengerReadPinStatus.INSTANCE, RequestType.GET, this.$userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            MessengerReadPinStatusResponseJson messengerReadPinStatusResponseJson = (MessengerReadPinStatusResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (messengerReadPinStatusResponseJson != null) {
                return Boolean.valueOf(messengerReadPinStatusResponseJson.has_pin);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass2(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.messenger.skills.read.repo.MessengerReadSkillRepository$unlockWithPin$2", f = "MessengerReadSkillRepository.kt", l = {104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.messenger.skills.read.repo.MessengerReadSkillRepository$unlockWithPin$2, reason: invalid class name and case insensitive filesystem */
    public final class C126882 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PinUnlockResult>, Object> {
        public final /* synthetic */ String $pin;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126882(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C126882> htJ) {
            super(2, htJ);
            this.$pin = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126882(this.$pin, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                MessengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 messengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = MessengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                MessengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 messengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = MessengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(messengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, messengerReadSkillRepository$unlockWithPin$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, MessengerReadJarvisPath.MessengerReadUnlock.INSTANCE, new MessengerReadUnlockRequestJson(this.$pin), RequestType.POST, this.$userSession, C3cG.A0S(30L), null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            if (HsJ.A00(objM1599executeJarvisRequestWithFof5HsY) != null) {
                return PinUnlockResult.ConnectivityError.INSTANCE;
            }
            MessengerReadUnlockResponseJson messengerReadUnlockResponseJson = (MessengerReadUnlockResponseJson) objM1599executeJarvisRequestWithFof5HsY;
            return messengerReadUnlockResponseJson.success ? PinUnlockResult.Success.INSTANCE : new PinUnlockResult.WrongPin(new PinError(messengerReadUnlockResponseJson.message, messengerReadUnlockResponseJson.error_code, messengerReadUnlockResponseJson.login_timeout_remaining_secs, messengerReadUnlockResponseJson.attempts_remaining));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super PinUnlockResult> htJ) {
            return ((C126882) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object getPinStatus(AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(abstractC3358CGz, null));
    }

    public final Object unlockWithPin(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super PinUnlockResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C126882(str, abstractC3358CGz, null));
    }
}
