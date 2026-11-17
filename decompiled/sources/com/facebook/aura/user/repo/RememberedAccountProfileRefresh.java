package com.facebook.aura.user.repo;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.CFK;
import X.G0V;
import X.G2j;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.login.credentials.AuraRememberedAccountsStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class RememberedAccountProfileRefresh {
    public final C3UX scope;
    public final G2j<String, String, String, String, Unit> updateProfile;

    /* renamed from: com.facebook.aura.user.repo.RememberedAccountProfileRefresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<String, String, String, String, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(4);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3, String str4) {
            invoke2(str, str2, str3, str4);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str, 0);
            AuraRememberedAccountsStore.device.updateProfile(str, str2, str3, str4);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.user.repo.RememberedAccountProfileRefresh$start$1", f = "RememberedAccountProfileRefresh.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.user.repo.RememberedAccountProfileRefresh$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C142641 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $abraUserId;
        public final /* synthetic */ String $name;
        public final /* synthetic */ String $profilePictureUrl;
        public final /* synthetic */ String $username;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142641(String str, String str2, String str3, String str4, HtJ<? super C142641> htJ) {
            super(2, htJ);
            this.$abraUserId = str;
            this.$name = str2;
            this.$username = str3;
            this.$profilePictureUrl = str4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RememberedAccountProfileRefresh.this.new C142641(this.$abraUserId, this.$name, this.$username, this.$profilePictureUrl, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                RememberedAccountProfileRefresh.this.updateProfile.invoke(this.$abraUserId, this.$name, this.$username, this.$profilePictureUrl);
            } catch (RuntimeException e) {
                CFK.A0A(RememberedAccountProfileRefreshKt.TAG, "Remembered account profile could not be refreshed", e);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C142641) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final HoC start(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass001.A11(new C142641(str, str2, str3, str4, null), this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RememberedAccountProfileRefresh(C3UX c3ux, G2j<? super String, ? super String, ? super String, ? super String, Unit> g2j) {
        AnonymousClass003.A0u(c3ux, g2j);
        this.scope = c3ux;
        this.updateProfile = g2j;
    }

    public /* synthetic */ RememberedAccountProfileRefresh(C3UX c3ux, G2j g2j, int i, C06H c06h) {
        this(c3ux, (i & 2) != 0 ? AnonymousClass1.INSTANCE : g2j);
    }
}
