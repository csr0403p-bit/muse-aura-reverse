package com.facebook.aura.devices.token;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BGK;
import X.C06H;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C8j3;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LinkDeviceKeys implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final LinkDeviceKeyEnvironment environment;
    public final C78T ioContext;
    public final G0U<LinkDeviceKeys, Unit> onRevocationQueued;
    public final C3UX revokeScope;

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {564, 314, 322}, m = "drainOnIo", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$drainOnIo$1, reason: invalid class name and case insensitive filesystem */
    public final class C116861 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C116861(HtJ<? super C116861> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.drainOnIo(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$launchDetachedRevoke$1", f = "LinkDeviceKeys.kt", l = {269}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$launchDetachedRevoke$1, reason: invalid class name and case insensitive filesystem */
    public final class C116871 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C116871(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C116871> htJ) {
            super(2, htJ);
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C116871(this.$block, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C116871(this.$block, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$block;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(LinkDeviceKeysKt.TAG, "detached revoke failed", e2);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {93}, m = "register", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$register$1, reason: invalid class name and case insensitive filesystem */
    public final class C116881 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C116881(HtJ<? super C116881> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.register(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$register$2", f = "LinkDeviceKeys.kt", l = {94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$register$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkDeviceKeyRegisterResult>, Object> {
        public final /* synthetic */ C10543Hqv<LinkDeviceKey> $registered;
        public final /* synthetic */ LinkDeviceKeyRegistration $registration;
        public final /* synthetic */ LinkDeviceKeyRecord $replacing;
        public final /* synthetic */ LinkDeviceKeyTarget $target;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LinkDeviceKeyRegistration linkDeviceKeyRegistration, LinkDeviceKeyTarget linkDeviceKeyTarget, LinkDeviceKeyRecord linkDeviceKeyRecord, C10543Hqv<LinkDeviceKey> c10543Hqv, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$registration = linkDeviceKeyRegistration;
            this.$target = linkDeviceKeyTarget;
            this.$replacing = linkDeviceKeyRecord;
            this.$registered = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkDeviceKeys.this.new AnonymousClass2(this.$registration, this.$target, this.$replacing, this.$registered, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            LinkDeviceKeyRegisterResult.Registered registered;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys linkDeviceKeys = LinkDeviceKeys.this;
                LinkDeviceKeyRegistration linkDeviceKeyRegistration = this.$registration;
                LinkDeviceKeyTarget linkDeviceKeyTarget = this.$target;
                LinkDeviceKeyRecord linkDeviceKeyRecord = this.$replacing;
                this.label = 1;
                obj = linkDeviceKeys.registerOnIo(linkDeviceKeyRegistration, linkDeviceKeyTarget, linkDeviceKeyRecord, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            C10543Hqv<LinkDeviceKey> c10543Hqv = this.$registered;
            LinkDeviceKeyRegisterResult linkDeviceKeyRegisterResult = (LinkDeviceKeyRegisterResult) obj;
            T t = 0;
            t = 0;
            if ((linkDeviceKeyRegisterResult instanceof LinkDeviceKeyRegisterResult.Registered) && (registered = (LinkDeviceKeyRegisterResult.Registered) linkDeviceKeyRegisterResult) != null) {
                t = registered.key;
            }
            c10543Hqv.element = t;
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LinkDeviceKeyRegisterResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {119, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "registerOnIo", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$registerOnIo$1, reason: invalid class name and case insensitive filesystem */
    public final class C116891 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C116891(HtJ<? super C116891> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.registerOnIo(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$resolveTarget$2", f = "LinkDeviceKeys.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$resolveTarget$2, reason: invalid class name and case insensitive filesystem */
    public final class C116902 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkDeviceKeyTargetResult>, Object> {
        public final /* synthetic */ long $connectTimeoutMs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116902(long j, HtJ<? super C116902> htJ) {
            super(2, htJ);
            this.$connectTimeoutMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C116902(this.$connectTimeoutMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys linkDeviceKeys = LinkDeviceKeys.this;
                long j = this.$connectTimeoutMs;
                this.label = 1;
                obj = linkDeviceKeys.resolveTargetOnIo(j, this);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LinkDeviceKeyTargetResult> htJ) {
            return ((C116902) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "resolveTargetOnIo", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$resolveTargetOnIo$1, reason: invalid class name and case insensitive filesystem */
    public final class C116911 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C116911(HtJ<? super C116911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.resolveTargetOnIo(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {227, 234}, m = "retryPendingRevocations", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$1, reason: invalid class name and case insensitive filesystem */
    public final class C116921 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116921(HtJ<? super C116921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.retryPendingRevocations(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$2", f = "LinkDeviceKeys.kt", l = {236}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$2, reason: invalid class name and case insensitive filesystem */
    public final class C116932 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Set<? extends String>>, Object> {
        public final /* synthetic */ long $connectTimeoutMs;
        public final /* synthetic */ LinkDeviceKeyOwnerState $state;
        public final /* synthetic */ Set<String> $unqueued;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116932(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState, Set<String> set, long j, HtJ<? super C116932> htJ) {
            super(2, htJ);
            this.$state = linkDeviceKeyOwnerState;
            this.$unqueued = set;
            this.$connectTimeoutMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C116932(this.$state, this.$unqueued, this.$connectTimeoutMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys$retryPendingRevocations$2$pending$1 linkDeviceKeys$retryPendingRevocations$2$pending$1 = new LinkDeviceKeys$retryPendingRevocations$2$pending$1(LinkDeviceKeys.this, this.$connectTimeoutMs, this.$state, null);
                this.label = 1;
                obj = GAX.A01(this, linkDeviceKeys$retryPendingRevocations$2$pending$1, 45000L);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            List<LinkDeviceKeyPendingRevokeJson> listPending = (List) obj;
            if (listPending == null) {
                listPending = LinkDeviceKeys.this.environment.getRevocations().pending(this.$state);
            }
            Set<String> set = this.$unqueued;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<LinkDeviceKeyPendingRevokeJson> it = listPending.iterator();
            while (it.hasNext()) {
                String str = it.next().node_id;
                if (str != null) {
                    arrayListA0h.add(str);
                }
            }
            return BGK.A01(arrayListA0h, set);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super Set<String>> htJ) {
            return ((C116932) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Set<? extends String>> htJ) {
            return invoke2(c3ux, (HtJ<? super Set<String>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeDetached$1", f = "LinkDeviceKeys.kt", l = {194}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeDetached$1, reason: invalid class name and case insensitive filesystem */
    public final class C116941 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkDeviceKey $key;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116941(LinkDeviceKey linkDeviceKey, HtJ<? super C116941> htJ) {
            super(1, htJ);
            this.$key = linkDeviceKey;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C116941(this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys linkDeviceKeys = LinkDeviceKeys.this;
                LinkDeviceKey linkDeviceKey = this.$key;
                this.label = 1;
                if (linkDeviceKeys.revoke(linkDeviceKey, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C116941) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeDeviceTokensDetached$1", f = "LinkDeviceKeys.kt", l = {198}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeDeviceTokensDetached$1, reason: invalid class name and case insensitive filesystem */
    public final class C116951 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $nodeId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116951(String str, HtJ<? super C116951> htJ) {
            super(1, htJ);
            this.$nodeId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C116951(this.$nodeId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys linkDeviceKeys = LinkDeviceKeys.this;
                String str = this.$nodeId;
                this.label = 1;
                if (linkDeviceKeys.revokeLatestMint(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C116951) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeKeyIdDetached$1", f = "LinkDeviceKeys.kt", l = {263}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeKeyIdDetached$1, reason: invalid class name and case insensitive filesystem */
    public final class C116961 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkDeviceKeyPendingRevokeJson $entry;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116961(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, HtJ<? super C116961> htJ) {
            super(1, htJ);
            this.$entry = linkDeviceKeyPendingRevokeJson;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C116961(this.$entry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys linkDeviceKeys = LinkDeviceKeys.this;
                LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson = this.$entry;
                this.label = 1;
                if (linkDeviceKeys.revokeQueued(linkDeviceKeyPendingRevokeJson, 15000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C116961) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {203}, m = "revokeLatestMint", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeLatestMint$1, reason: invalid class name and case insensitive filesystem */
    public final class C116971 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C116971(HtJ<? super C116971> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.revokeLatestMint(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {212, 217}, m = "revokeNode", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeNode$1, reason: invalid class name and case insensitive filesystem */
    public final class C116981 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116981(HtJ<? super C116981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.revokeNode(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeNodeDetached$1", f = "LinkDeviceKeys.kt", l = {252}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeNodeDetached$1, reason: invalid class name and case insensitive filesystem */
    public final class C116991 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkDeviceKeyPendingRevokeJson $entry;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116991(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, HtJ<? super C116991> htJ) {
            super(1, htJ);
            this.$entry = linkDeviceKeyPendingRevokeJson;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C116991(this.$entry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeys linkDeviceKeys = LinkDeviceKeys.this;
                LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson = this.$entry;
                this.label = 1;
                if (linkDeviceKeys.revokeQueued(linkDeviceKeyPendingRevokeJson, 15000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C116991) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {282, 283}, m = "revokeQueued", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$1, reason: invalid class name and case insensitive filesystem */
    public final class C117001 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117001(HtJ<? super C117001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.revokeQueued(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$2", f = "LinkDeviceKeys.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$2, reason: invalid class name and case insensitive filesystem */
    public final class C117012 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkDeviceKeyPendingRevokeJson $entry;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117012(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, HtJ<? super C117012> htJ) {
            super(2, htJ);
            this.$entry = linkDeviceKeyPendingRevokeJson;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C117012(this.$entry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            LinkDeviceKeys.this.enqueueRevoke(this.$entry);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C117012) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$3", f = "LinkDeviceKeys.kt", l = {289}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ long $connectTimeoutMs;
        public final /* synthetic */ LinkDeviceKeyPendingRevokeJson $entry;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$3$1", f = "LinkDeviceKeys.kt", l = {290}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ long $connectTimeoutMs;
            public final /* synthetic */ LinkDeviceKeyPendingRevokeJson $entry;
            public final /* synthetic */ LinkDeviceKeyOwnerState $selection;
            public int label;
            public final /* synthetic */ LinkDeviceKeys this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LinkDeviceKeys linkDeviceKeys, long j, LinkDeviceKeyOwnerState linkDeviceKeyOwnerState, LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = linkDeviceKeys;
                this.$connectTimeoutMs = j;
                this.$selection = linkDeviceKeyOwnerState;
                this.$entry = linkDeviceKeyPendingRevokeJson;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$connectTimeoutMs, this.$selection, this.$entry, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                boolean z = true;
                if (i == 0) {
                    Hwg.A00(obj);
                    LinkDeviceKeys linkDeviceKeys = this.this$0;
                    long j = this.$connectTimeoutMs;
                    LinkDeviceKeyOwnerState linkDeviceKeyOwnerState = this.$selection;
                    this.label = 1;
                    obj = linkDeviceKeys.drainOnIo(j, linkDeviceKeyOwnerState, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                Iterable iterable = (Iterable) obj;
                LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson = this.$entry;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (LinkDeviceKeyRevocationQueueKt.isSame((LinkDeviceKeyPendingRevokeJson) it.next(), linkDeviceKeyPendingRevokeJson)) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, long j, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$entry = linkDeviceKeyPendingRevokeJson;
            this.$connectTimeoutMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = LinkDeviceKeys.this.new AnonymousClass3(this.$entry, this.$connectTimeoutMs, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            String str;
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean zBooleanValue = false;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeyOwnerState linkDeviceKeyOwnerStateOwnerState = LinkDeviceKeys.this.environment.ownerState();
                if (!LinkDeviceKeyRevocationQueueKt.isFor(this.$entry, linkDeviceKeyOwnerStateOwnerState)) {
                    objArr = new Object[]{LinkDeviceKeyRevocationQueueKt.getLogTag(this.$entry)};
                    str = "revoke queued for a VM that is not selected: %s";
                    CFK.A0H(LinkDeviceKeysKt.TAG, str, objArr);
                    return Boolean.valueOf(zBooleanValue);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LinkDeviceKeys.this, this.$connectTimeoutMs, linkDeviceKeyOwnerStateOwnerState, this.$entry, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 1;
                obj = GAX.A01(this, anonymousClass1, 45000L);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                return Boolean.valueOf(zBooleanValue);
            }
            objArr = new Object[]{LinkDeviceKeyRevocationQueueKt.getLogTag(this.$entry)};
            str = "revoke timed out: %s";
            CFK.A0H(LinkDeviceKeysKt.TAG, str, objArr);
            return Boolean.valueOf(zBooleanValue);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$selectedVmKind$2", f = "LinkDeviceKeys.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$selectedVmKind$2, reason: invalid class name and case insensitive filesystem */
    public final class C117022 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkDeviceVmKind>, Object> {
        public int label;

        public C117022(HtJ<? super C117022> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C117022(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LinkDeviceVmKind> htJ) {
            return LinkDeviceKeys.this.new C117022(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return LinkDeviceKeysKt.vmKindOf(LinkDeviceKeys.this.environment.ownerState());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {333}, m = "sendRevoke", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$1, reason: invalid class name and case insensitive filesystem */
    public final class C117031 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C117031(HtJ<? super C117031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeys.this.sendRevoke(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$2", f = "LinkDeviceKeys.kt", l = {334}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$2, reason: invalid class name and case insensitive filesystem */
    public final class C117042 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends LinkDeviceKeyRevokeResponseJson>>, Object> {
        public final /* synthetic */ LinkDeviceKeyPendingRevokeJson $entry;
        public final /* synthetic */ String $gatewayUrl;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117042(String str, LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, HtJ<? super C117042> htJ) {
            super(1, htJ);
            this.$gatewayUrl = str;
            this.$entry = linkDeviceKeyPendingRevokeJson;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LinkDeviceKeys.this.new C117042(this.$gatewayUrl, this.$entry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objMo732revoke0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeyEnvironment linkDeviceKeyEnvironment = LinkDeviceKeys.this.environment;
                String str = this.$gatewayUrl;
                LinkDeviceKeyRevokeRequestJson request = LinkDeviceKeyRevocationQueueKt.getRequest(this.$entry);
                this.label = 1;
                objMo732revoke0E7RQCE = linkDeviceKeyEnvironment.mo732revoke0E7RQCE(str, request, this);
                if (objMo732revoke0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objMo732revoke0E7RQCE = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objMo732revoke0E7RQCE);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<LinkDeviceKeyRevokeResponseJson>> htJ) {
            return ((C117042) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends LinkDeviceKeyRevokeResponseJson>> htJ) {
            return invoke2((HtJ<? super HsJ<LinkDeviceKeyRevokeResponseJson>>) htJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0050: IGET (r0 I:T) = (r10 I:X.Hqv) (LINE:80) X.Hqv.element java.lang.Object, block:B:20:0x0050 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.Hqv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object register(com.facebook.aura.devices.token.LinkDeviceKeyRegistration r12, com.facebook.aura.devices.token.LinkDeviceKeyTarget r13, com.facebook.aura.devices.token.LinkDeviceKeyRecord r14, X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult> r15) {
        /*
            r11 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C116881
            r6 = r11
            if (r0 == 0) goto L24
            r4 = r3
            com.facebook.aura.devices.token.LinkDeviceKeys$register$1 r4 = (com.facebook.aura.devices.token.LinkDeviceKeys.C116881) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L5d
            java.lang.Object r10 = r4.L$3
            X.Hqv r10 = (X.C10543Hqv) r10
            goto L2a
        L24:
            com.facebook.aura.devices.token.LinkDeviceKeys$register$1 r4 = new com.facebook.aura.devices.token.LinkDeviceKeys$register$1
            r4.<init>(r15)
            goto L14
        L2a:
            X.Hwg.A00(r3)     // Catch: java.util.concurrent.CancellationException -> L4f
            return r3
        L2e:
            X.Hqv r10 = X.C3cG.A10(r3)
            X.78T r0 = r11.ioContext     // Catch: java.util.concurrent.CancellationException -> L4f
            r11 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$register$2 r5 = new com.facebook.aura.devices.token.LinkDeviceKeys$register$2     // Catch: java.util.concurrent.CancellationException -> L4f
            r7 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L4f
            r4.L$0 = r11     // Catch: java.util.concurrent.CancellationException -> L4f
            r4.L$1 = r11     // Catch: java.util.concurrent.CancellationException -> L4f
            r4.L$2 = r11     // Catch: java.util.concurrent.CancellationException -> L4f
            r4.L$3 = r10     // Catch: java.util.concurrent.CancellationException -> L4f
            r4.label = r1     // Catch: java.util.concurrent.CancellationException -> L4f
            java.lang.Object r0 = X.GAo.A00(r4, r0, r5)     // Catch: java.util.concurrent.CancellationException -> L4f
            if (r0 != r2) goto L4e
            return r2
        L4e:
            return r0
        L4f:
            r1 = move-exception
            T r0 = r10.element
            com.facebook.aura.devices.token.LinkDeviceKey r0 = (com.facebook.aura.devices.token.LinkDeviceKey) r0
            if (r0 == 0) goto L61
            r0.clear()
            r6.revokeDetached(r0)
            throw r1
        L5d:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L61:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.register(com.facebook.aura.devices.token.LinkDeviceKeyRegistration, com.facebook.aura.devices.token.LinkDeviceKeyTarget, com.facebook.aura.devices.token.LinkDeviceKeyRecord, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryPendingRevocations(java.util.Set<java.lang.String> r13, long r14, X.HtJ<? super java.util.Set<java.lang.String>> r16) {
        /*
            r12 = this;
            r10 = r14
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C116921
            r7 = r12
            if (r0 == 0) goto L28
            r5 = r3
            com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$1 r5 = (com.facebook.aura.devices.token.LinkDeviceKeys.C116921) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.label = r2
        L16:
            java.lang.Object r8 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 == r6) goto L6c
            if (r0 != r3) goto L2e
            X.Hwg.A00(r8)
            return r8
        L28:
            com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$1 r5 = new com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$1
            r5.<init>(r3)
            goto L16
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r8)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L4b
            com.facebook.aura.devices.token.LinkDeviceKeyEnvironment r0 = r12.environment
            com.facebook.aura.devices.token.LinkDeviceKeyRevocationQueue r0 = r0.getRevocations()
            boolean r0 = r0.hasPending()
            if (r0 != 0) goto L4b
            X.A3q r0 = X.A3q.A00
        L4a:
            return r0
        L4b:
            java.util.LinkedHashSet r9 = X.C3cG.A0k()
            X.HwK r1 = X.HwK.A00
            X.78T r0 = r12.ioContext
            X.78T r2 = X.C78W.A02(r1, r0)
            r1 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$state$1 r0 = new com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$state$1
            r0.<init>(r12, r13, r9, r1)
            r5.L$0 = r1
            r5.L$1 = r9
            r5.J$0 = r14
            r5.label = r6
            java.lang.Object r8 = X.GAo.A00(r5, r2, r0)
            if (r8 != r4) goto L75
            return r4
        L6c:
            long r10 = r5.J$0
            java.lang.Object r9 = r5.L$1
            java.util.Set r9 = (java.util.Set) r9
            X.Hwg.A00(r8)
        L75:
            com.facebook.aura.devices.token.LinkDeviceKeyOwnerState r8 = (com.facebook.aura.devices.token.LinkDeviceKeyOwnerState) r8
            X.78T r0 = r12.ioContext
            r12 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$2 r6 = new com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$2
            r6.<init>(r8, r9, r10, r12)
            r5.L$0 = r12
            r5.L$1 = r12
            r5.L$2 = r12
            r5.J$0 = r10
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r0, r6)
            if (r0 != r4) goto L4a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.retryPendingRevocations(java.util.Set, long, X.HtJ):java.lang.Object");
    }

    public final void revokeDetached(LinkDeviceKey linkDeviceKey) {
        C7384Etj.A0Y(linkDeviceKey, 0);
        launchDetachedRevoke(new C116941(linkDeviceKey, null));
    }

    public final HoC revokeDeviceTokensDetached(String str) {
        C7384Etj.A0Y(str, 0);
        return launchDetachedRevoke(new C116951(str, null));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RevokeAttempt.values().length];
            try {
                AnonymousClass002.A13(RevokeAttempt.SETTLED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RevokeAttempt.FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:33:0x00b1, B:30:0x009e], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:50:0x011c, B:51:0x011f, B:54:0x012a, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fe, B:59:0x0144, B:57:0x013f, B:58:0x0143, B:55:0x0134, B:40:0x00cf, B:41:0x00d2, B:21:0x007a, B:23:0x008a, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:33:0x00b1, B:34:0x00b5, B:36:0x00bb), top: B:65:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:50:0x011c, B:51:0x011f, B:54:0x012a, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fe, B:59:0x0144, B:57:0x013f, B:58:0x0143, B:55:0x0134, B:40:0x00cf, B:41:0x00d2, B:21:0x007a, B:23:0x008a, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:33:0x00b1, B:34:0x00b5, B:36:0x00bb), top: B:65:0x001c }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.BLa, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0119 -> B:51:0x011f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object drainOnIo(long r11, com.facebook.aura.devices.token.LinkDeviceKeyOwnerState r13, X.HtJ<? super java.util.List<com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson>> r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.drainOnIo(long, com.facebook.aura.devices.token.LinkDeviceKeyOwnerState, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object drainOnIo$default(LinkDeviceKeys linkDeviceKeys, long j, LinkDeviceKeyOwnerState linkDeviceKeyOwnerState, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            linkDeviceKeyOwnerState = linkDeviceKeys.environment.ownerState();
        }
        return linkDeviceKeys.drainOnIo(j, linkDeviceKeyOwnerState, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueRevoke(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson) {
        this.environment.getRevocations().enqueue(linkDeviceKeyPendingRevokeJson);
        if (Hxb.A04(this.revokeScope)) {
            this.onRevocationQueued.invoke(this);
        }
    }

    private final LinkDeviceKeyRevocationQueue getRevocations() {
        return this.environment.getRevocations();
    }

    private final boolean isCurrent(LinkDeviceKeyTarget linkDeviceKeyTarget) {
        return LinkDeviceKeysKt.ownerSessionQualifies(this.environment.ownerState(), linkDeviceKeyTarget);
    }

    private final HoC launchDetachedRevoke(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        C3UX c3ux = this.revokeScope;
        return GAo.A02(C79.A0K, C6ys.A00, new C116871(g0u, null), c3ux);
    }

    public static /* synthetic */ Object register$default(LinkDeviceKeys linkDeviceKeys, LinkDeviceKeyRegistration linkDeviceKeyRegistration, LinkDeviceKeyTarget linkDeviceKeyTarget, LinkDeviceKeyRecord linkDeviceKeyRecord, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            linkDeviceKeyRecord = null;
        }
        return linkDeviceKeys.register(linkDeviceKeyRegistration, linkDeviceKeyTarget, linkDeviceKeyRecord, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerOnIo(com.facebook.aura.devices.token.LinkDeviceKeyRegistration r11, com.facebook.aura.devices.token.LinkDeviceKeyTarget r12, com.facebook.aura.devices.token.LinkDeviceKeyRecord r13, X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult> r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.registerOnIo(com.facebook.aura.devices.token.LinkDeviceKeyRegistration, com.facebook.aura.devices.token.LinkDeviceKeyTarget, com.facebook.aura.devices.token.LinkDeviceKeyRecord, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object resolveTarget$default(LinkDeviceKeys linkDeviceKeys, long j, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 15000;
        }
        return linkDeviceKeys.resolveTarget(j, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveTargetOnIo(long r8, X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceKeyTargetResult> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C116911
            if (r0 == 0) goto L5d
            r6 = r10
            com.facebook.aura.devices.token.LinkDeviceKeys$resolveTargetOnIo$1 r6 = (com.facebook.aura.devices.token.LinkDeviceKeys.C116911) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L63
            java.lang.Object r3 = r6.L$0
            com.facebook.aura.devices.token.LinkDeviceKeyTarget r3 = (com.facebook.aura.devices.token.LinkDeviceKeyTarget) r3
            X.Hwg.A00(r1)
        L24:
            boolean r0 = r7.isCurrent(r3)
            if (r0 == 0) goto L68
            com.facebook.aura.devices.token.LinkDeviceKeyTargetResult$Resolved r1 = new com.facebook.aura.devices.token.LinkDeviceKeyTargetResult$Resolved
            r1.<init>(r3)
            return r1
        L30:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.token.LinkDeviceKeyEnvironment r0 = r7.environment
            com.facebook.aura.devices.token.LinkDeviceKeyOwnerState r0 = r0.ownerState()
            com.facebook.aura.devices.token.LinkDeviceKeyTarget r3 = com.facebook.aura.devices.token.LinkDeviceKeysKt.targetFor(r0)
            if (r3 != 0) goto L42
            com.facebook.aura.devices.token.LinkDeviceKeyFailure r0 = com.facebook.aura.devices.token.LinkDeviceKeyFailure.TARGET_UNRESOLVED
            goto L7b
        L42:
            boolean r0 = r7.isCurrent(r3)
            if (r0 != 0) goto L24
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L24
            com.facebook.aura.devices.token.LinkDeviceKeyEnvironment r0 = r7.environment
            r6.L$0 = r3
            r6.J$0 = r8
            r6.label = r4
            java.lang.Object r0 = r0.awaitGatewayConnected(r8, r6)
            if (r0 != r5) goto L24
            return r5
        L5d:
            com.facebook.aura.devices.token.LinkDeviceKeys$resolveTargetOnIo$1 r6 = new com.facebook.aura.devices.token.LinkDeviceKeys$resolveTargetOnIo$1
            r6.<init>(r10)
            goto L12
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L68:
            com.facebook.aura.devices.token.LinkDeviceVmKind r0 = r3.vmKind
            java.lang.String r0 = r0.getWireValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "LinkDeviceKeys"
            java.lang.String r0 = "No owner Noise session qualifies for %s VM"
            X.CFK.A0H(r1, r0, r2)
            com.facebook.aura.devices.token.LinkDeviceKeyFailure r0 = com.facebook.aura.devices.token.LinkDeviceKeyFailure.OWNER_SESSION_UNAVAILABLE
        L7b:
            com.facebook.aura.devices.token.LinkDeviceKeyTargetResult$Failed r1 = new com.facebook.aura.devices.token.LinkDeviceKeyTargetResult$Failed
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.resolveTargetOnIo(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retryPendingRevocations$default(LinkDeviceKeys linkDeviceKeys, Set set, long j, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            set = A3q.A00;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return linkDeviceKeys.retryPendingRevocations(set, j, htJ);
    }

    private final void revokeKeyIdDetached(byte[] bArr, LinkDeviceKeyTarget linkDeviceKeyTarget) {
        LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson = new LinkDeviceKeyPendingRevokeJson(linkDeviceKeyTarget.hatcheryVmId, linkDeviceKeyTarget.vmId, linkDeviceKeyTarget.vmKind.getWireValue(), Base64.getEncoder().encodeToString(bArr), null, 0);
        C8j3.A1L(bArr);
        launchDetachedRevoke(new C116961(linkDeviceKeyPendingRevokeJson, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeLatestMint(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C116971
            if (r0 == 0) goto L40
            r5 = r8
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeLatestMint$1 r5 = (com.facebook.aura.devices.token.LinkDeviceKeys.C116971) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 != r3) goto L46
            X.Hwg.A00(r0)
        L20:
            java.lang.String r2 = "latest mint's device tokens revoked: %s"
            java.lang.String r1 = "LinkDeviceKeys"
            X.CFK.A03(r0, r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2a:
            X.Hwg.A00(r0)
            X.HwK r2 = X.HwK.A00
            r1 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeLatestMint$revoked$1 r0 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeLatestMint$revoked$1
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L40:
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeLatestMint$1 r5 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeLatestMint$1
            r5.<init>(r8)
            goto L12
        L46:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.revokeLatestMint(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void revokeNodeDetached(String str, LinkDeviceKeyTarget linkDeviceKeyTarget) {
        launchDetachedRevoke(new C116991(new LinkDeviceKeyPendingRevokeJson(linkDeviceKeyTarget.hatcheryVmId, linkDeviceKeyTarget.vmId, linkDeviceKeyTarget.vmKind.getWireValue(), null, str, 0), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeQueued(com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson r8, long r9, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C117001
            if (r0 == 0) goto L24
            r4 = r11
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$1 r4 = (com.facebook.aura.devices.token.LinkDeviceKeys.C117001) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L2f
            if (r0 == r6) goto L4d
            if (r0 != r5) goto L2a
            X.Hwg.A00(r1)
            return r1
        L24:
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$1 r4 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$1
            r4.<init>(r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r1)
            X.HwK r1 = X.HwK.A00
            X.78T r0 = r7.ioContext
            X.78T r2 = X.C78W.A02(r1, r0)
            r1 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$2 r0 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$2
            r0.<init>(r8, r1)
            r4.L$0 = r8
            r4.J$0 = r9
            r4.label = r6
            java.lang.Object r0 = X.GAo.A00(r4, r2, r0)
            if (r0 != r3) goto L56
        L4c:
            return r3
        L4d:
            long r9 = r4.J$0
            java.lang.Object r8 = r4.L$0
            com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson r8 = (com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson) r8
            X.Hwg.A00(r1)
        L56:
            X.78T r0 = r7.ioContext
            r11 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$3 r6 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeQueued$3
            r6.<init>(r8, r9, r11)
            r4.L$0 = r11
            r4.J$0 = r9
            r4.label = r5
            java.lang.Object r0 = X.GAo.A00(r4, r0, r6)
            if (r0 == r3) goto L4c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.revokeQueued(com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: send-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m734sendgIAlus(X.G0U<? super X.HtJ<? super X.HsJ<? extends T>>, ? extends java.lang.Object> r6, X.HtJ<? super X.HsJ<? extends T>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.devices.token.LinkDeviceKeys$send$1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.devices.token.LinkDeviceKeys$send$1 r4 = (com.facebook.aura.devices.token.LinkDeviceKeys$send$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L38
        L1e:
            com.facebook.aura.devices.token.LinkDeviceKeys$send$1 r4 = new com.facebook.aura.devices.token.LinkDeviceKeys$send$1
            r4.<init>(r5, r7)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L42
            r4.label = r1     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L42
            java.lang.Object r3 = r6.invoke(r4)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L42
            if (r3 != r2) goto L3b
            return r2
        L38:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L42
        L3b:
            X.HsJ r3 = (X.HsJ) r3     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L42
            java.lang.Object r0 = r3.value     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L42
            return r0
        L40:
            r0 = move-exception
            goto L4c
        L42:
            X.C3cG.A1H(r4)
            com.facebook.aura.devices.token.LinkDeviceKeyFailure r1 = com.facebook.aura.devices.token.LinkDeviceKeyFailure.OWNER_SESSION_UNAVAILABLE
            com.facebook.aura.devices.token.LinkDeviceKeyException r0 = new com.facebook.aura.devices.token.LinkDeviceKeyException
            r0.<init>(r1)
        L4c:
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.m734sendgIAlus(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[PHI: r3
  0x0059: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v3 java.lang.Integer), (r3v3 java.lang.Integer) binds: [B:29:0x0071, B:22:0x0053, B:24:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendRevoke(com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.devices.token.RevokeAttempt> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C117031
            if (r0 == 0) goto L89
            r5 = r9
            com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$1 r5 = (com.facebook.aura.devices.token.LinkDeviceKeys.C117031) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L74
            if (r0 != r1) goto La5
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson r7 = (com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson) r7
            java.lang.Object r0 = X.AnonymousClass001.A0q(r4)
        L26:
            java.lang.Throwable r2 = X.HsJ.A00(r0)
            java.lang.String r4 = "LinkDeviceKeys"
            if (r2 != 0) goto L42
            com.facebook.aura.devices.token.LinkDeviceKeyRevokeResponseJson r0 = (com.facebook.aura.devices.token.LinkDeviceKeyRevokeResponseJson) r0
            java.lang.String r2 = com.facebook.aura.devices.token.LinkDeviceKeyRevocationQueueKt.getLogTag(r7)
            int r0 = r0.revoked
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            java.lang.String r0 = "revoked %s count=%d"
            X.CFK.A02(r2, r1, r4, r0)
        L3f:
            com.facebook.aura.devices.token.RevokeAttempt r2 = com.facebook.aura.devices.token.RevokeAttempt.SETTLED
            return r2
        L42:
            boolean r1 = r2 instanceof com.facebook.aura.json.NetworkException
            if (r1 == 0) goto L71
            r0 = r2
            com.facebook.aura.json.NetworkException r0 = (com.facebook.aura.json.NetworkException) r0
            if (r0 == 0) goto L71
            int r0 = r0.httpResponseCode
            java.lang.Integer r3 = X.C3cG.A0R(r0)
        L51:
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            if (r2 == 0) goto L59
            java.lang.String r2 = r2.errorCode
            if (r2 != 0) goto L5b
        L59:
            java.lang.String r2 = "none"
        L5b:
            java.util.Set<java.lang.Integer> r0 = com.facebook.aura.devices.token.LinkDeviceKeysKt.SETTLED_REVOKE_FAILURE_CODES
            boolean r0 = X.AbstractC0878AGe.A0k(r0, r3)
            if (r0 == 0) goto L8f
            java.lang.String r0 = com.facebook.aura.devices.token.LinkDeviceKeyRevocationQueueKt.getLogTag(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r3, r2}
            java.lang.String r0 = "revoke dropped: %s status=%s code=%s"
            X.CFK.A0H(r4, r0, r1)
            goto L3f
        L71:
            if (r1 == 0) goto L59
            goto L51
        L74:
            X.Hwg.A00(r4)
            com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$2 r0 = new com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$2
            r0.<init>(r8, r7, r3)
            r5.L$0 = r7
            r5.L$1 = r3
            r5.label = r1
            java.lang.Object r0 = r6.m734sendgIAlus(r0, r5)
            if (r0 != r2) goto L26
            return r2
        L89:
            com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$1 r5 = new com.facebook.aura.devices.token.LinkDeviceKeys$sendRevoke$1
            r5.<init>(r9)
            goto L12
        L8f:
            java.lang.String r1 = com.facebook.aura.devices.token.LinkDeviceKeyRevocationQueueKt.getLogTag(r7)
            int r0 = r7.attempts
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2, r0}
            java.lang.String r0 = "revoke failed: %s status=%s code=%s attempts=%d"
            X.CFK.A0H(r4, r0, r1)
            com.facebook.aura.devices.token.RevokeAttempt r2 = com.facebook.aura.devices.token.RevokeAttempt.FAILED
            return r2
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.sendRevoke(com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.revokeScope);
    }

    public final C3UX getRevokeScope$fbandroid_express_aura_java_com_facebook_aura_devices_token_token() {
        return this.revokeScope;
    }

    public final boolean hasPendingRevocationsForSelectedVm$fbandroid_express_aura_java_com_facebook_aura_devices_token_token() {
        return !this.environment.getRevocations().pending(this.environment.ownerState()).isEmpty();
    }

    public final Object resolveTarget(long j, HtJ<? super LinkDeviceKeyTargetResult> htJ) {
        return GAo.A00(htJ, this.ioContext, new C116902(j, null));
    }

    public final Object revoke(LinkDeviceKey linkDeviceKey, HtJ<? super Boolean> htJ) {
        LinkDeviceKeyTarget linkDeviceKeyTarget = linkDeviceKey.target;
        return revokeQueued(new LinkDeviceKeyPendingRevokeJson(linkDeviceKeyTarget.hatcheryVmId, linkDeviceKeyTarget.vmId, linkDeviceKeyTarget.vmKind.getWireValue(), linkDeviceKey.encodedKeyId, null, 0), 15000L, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeNode(java.lang.String r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.devices.token.LinkDeviceKeys.C116981
            if (r0 == 0) goto L24
            r7 = r10
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeNode$1 r7 = (com.facebook.aura.devices.token.LinkDeviceKeys.C116981) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L4d
            if (r0 != r5) goto L2a
            X.Hwg.A00(r2)
            return r2
        L24:
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeNode$1 r7 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeNode$1
            r7.<init>(r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r2)
            java.lang.String r3 = com.facebook.aura.devices.token.HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(r9)
            if (r3 == 0) goto L5b
            X.78T r2 = r8.ioContext
            r1 = 0
            com.facebook.aura.devices.token.LinkDeviceKeys$revokeNode$entry$1 r0 = new com.facebook.aura.devices.token.LinkDeviceKeys$revokeNode$entry$1
            r0.<init>(r3, r8, r1)
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r4
            java.lang.Object r2 = X.GAo.A00(r7, r2, r0)
            if (r2 != r6) goto L50
            return r6
        L4d:
            X.Hwg.A00(r2)
        L50:
            com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson r2 = (com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson) r2
            if (r2 != 0) goto L60
            java.lang.String r1 = "LinkDeviceKeys"
            java.lang.String r0 = "revoke by node not queued: no VM selected"
            X.CFK.A04(r1, r0)
        L5b:
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
        L5f:
            return r0
        L60:
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r0
            r7.label = r5
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r8.revokeQueued(r2, r0, r7)
            if (r0 != r6) goto L5f
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeys.revokeNode(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object selectedVmKind(HtJ<? super LinkDeviceVmKind> htJ) {
        return GAo.A00(htJ, this.ioContext, new C117022(null));
    }

    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<LinkDeviceKeys, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceKeys linkDeviceKeys) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkDeviceKeys linkDeviceKeys) {
        }
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final LinkDeviceKeys forSession(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LinkDeviceKeys) abstractC3358CGz.A03(LinkDeviceKeys.class, new LinkDeviceKeys$Companion$forSession$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkDeviceKeys(LinkDeviceKeyEnvironment linkDeviceKeyEnvironment, C3UX c3ux, C78T c78t, G0U<? super LinkDeviceKeys, Unit> g0u) {
        AnonymousClass005.A14(linkDeviceKeyEnvironment, c3ux, c78t, g0u);
        this.environment = linkDeviceKeyEnvironment;
        this.revokeScope = c3ux;
        this.ioContext = c78t;
        this.onRevocationQueued = g0u;
    }

    public /* synthetic */ LinkDeviceKeys(LinkDeviceKeyEnvironment linkDeviceKeyEnvironment, C3UX c3ux, C78T c78t, G0U g0u, int i, C06H c06h) {
        this(linkDeviceKeyEnvironment, c3ux, (i & 4) != 0 ? AnonymousClass001.A0y() : c78t, (i & 8) != 0 ? AnonymousClass1.INSTANCE : g0u);
    }
}
