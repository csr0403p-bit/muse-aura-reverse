package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass603;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C3pU;
import X.C3rb;
import X.C7384Etj;
import X.C7438Evz;
import X.C78T;
import X.C9286GCn;
import X.CH0;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.G0W;
import X.G2k;
import X.GDB;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.HzS;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.gateway.AvatarMediaUrlsKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.AiIdentity;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchVoiceAvatarStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Uri> _currentAvatarUri;
    public final C1BN<Uri> currentAvatarUri;
    public String currentCacheKey;
    public long currentRefresh;
    public HxE<String, String> currentVm;
    public final Set<String> deletingPaths;
    public final BLG<Long> downloadRetry;
    public final Object filesLock;
    public final HatchGatewayConnection gateway;
    public final HatchGatewayPrefsStore gatewayPrefs;
    public final Set<String> inFlightPaths;
    public final BLG<HxE<String, String>> preferredStill;
    public final Map<String, Integer> retainedPaths;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1", f = "HatchVoiceAvatarStore.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<HxE<Long, Long>> $generations;
        public final /* synthetic */ C20Q<HxE<String, String>> $vm;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1$1", f = "HatchVoiceAvatarStore.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02841 extends AbstractC07127nr implements G0W<AiIdentity, HxE<? extends String, ? extends String>, HtJ<? super HxE<? extends String, ? extends String>>, Object> {
            public int label;
            public final /* synthetic */ HatchVoiceAvatarStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02841(HatchVoiceAvatarStore hatchVoiceAvatarStore, HtJ<? super C02841> htJ) {
                super(3, htJ);
                this.this$0 = hatchVoiceAvatarStore;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AiIdentity aiIdentity, HxE<String, String> hxE, HtJ<? super HxE<String, String>> htJ) {
                return new C02841(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return this.this$0.stillSource();
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(AiIdentity aiIdentity, HxE<? extends String, ? extends String> hxE, HtJ<? super HxE<? extends String, ? extends String>> htJ) {
                return invoke2(aiIdentity, (HxE<String, String>) hxE, (HtJ<? super HxE<String, String>>) htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1$2", f = "HatchVoiceAvatarStore.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G2k<HxE<? extends String, ? extends String>, HxE<? extends Long, ? extends Long>, Long, HxE<? extends String, ? extends String>, HtJ<? super AvatarRequest>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(5, htJ);
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends String, ? extends String> hxE, HxE<? extends Long, ? extends Long> hxE2, Long l, HxE<? extends String, ? extends String> hxE3, HtJ<? super AvatarRequest> htJ) {
                return invoke((HxE<String, String>) hxE, (HxE<Long, Long>) hxE2, C3cG.A05(l), (HxE<String, String>) hxE3, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HxE hxE = (HxE) this.L$0;
                HxE hxE2 = (HxE) this.L$1;
                HxE hxE3 = (HxE) this.L$2;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                String str = (String) hxE.first;
                String str2 = (String) hxE.second;
                long jA05 = C3cG.A05(hxE2.first);
                long jA052 = C3cG.A05(hxE2.second);
                return new AvatarRequest(str, HatchVoiceAvatarStoreKt.avatarCacheKey((String) hxE3.first, (String) hxE3.second, str2), jA052, hxE3, AnonymousClass002.A1M((jA05 > jA052 ? 1 : (jA05 == jA052 ? 0 : -1))));
            }

            public final Object invoke(HxE<String, String> hxE, HxE<Long, Long> hxE2, long j, HxE<String, String> hxE3, HtJ<? super AvatarRequest> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = hxE;
                anonymousClass2.L$1 = hxE2;
                anonymousClass2.L$2 = hxE3;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$1$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0V {
            public AnonymousClass3(Object obj) {
                super(2, obj, HatchVoiceAvatarStore.class, "refreshAvatar", "refreshAvatar(Lcom/facebook/aura/partners/voice/avatar/AvatarRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // X.G0V
            public final Object invoke(AvatarRequest avatarRequest, HtJ<? super Unit> htJ) {
                return C3cG.A0U(((HatchVoiceAvatarStore) this.receiver).refreshAvatar(avatarRequest, htJ));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C20Q<HxE<Long, Long>> c20q, C20Q<HxE<String, String>> c20q2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$generations = c20q;
            this.$vm = c20q2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVoiceAvatarStore.this.new AnonymousClass1(this.$generations, this.$vm, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AiIdentity> aiIdentity = HatchVoiceAvatarStore.this.gateway.getAiIdentity();
                HatchVoiceAvatarStore hatchVoiceAvatarStore = HatchVoiceAvatarStore.this;
                AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AnonymousClass2(null), C3rb.A04(new C02841(hatchVoiceAvatarStore, null), aiIdentity, hatchVoiceAvatarStore.preferredStill), this.$generations, HatchVoiceAvatarStore.this.downloadRetry, this.$vm);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(HatchVoiceAvatarStore.this);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass3, anonymousClass603A01) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore", f = "HatchVoiceAvatarStore.kt", l = {230, 269}, m = "downloadAndCacheAvatar", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$downloadAndCacheAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C130731 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C130731(HtJ<? super C130731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVoiceAvatarStore.this.downloadAndCacheAvatar(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$pruneFiles$1", f = "HatchVoiceAvatarStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$pruneFiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C130741 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C130741(HtJ<? super C130741> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVoiceAvatarStore.this.new C130741(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Context context = AuraAppContext.INSTANCE.getContext();
            if (context != null) {
                File[] fileArrListFiles = C3cG.A0O(C3cG.A0O(context.getFilesDir(), HatchVoiceAvatarStoreKt.VOICE_AVATAR_DIR), ((CH0) HatchVoiceAvatarStore.this.userSession).A01).listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                HatchVoiceAvatarStore hatchVoiceAvatarStore = HatchVoiceAvatarStore.this;
                for (File file : fileArrListFiles) {
                    hatchVoiceAvatarStore.deleteFileIfUnused(file);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchVoiceAvatarStore.this.new C130741(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void pruneFiles(C3UX c3ux) {
        AnonymousClass001.A1J(new C130741(null), c3ux);
    }

    public final String cachedAvatarFileFor(String str, String str2, HxE<String, String> hxE) {
        Context context;
        Object next;
        C7384Etj.A0Y(hxE, 2);
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && AuraSessionManager.INSTANCE.isCurrentSession(this.userSession) && (context = AuraAppContext.INSTANCE.getContext()) != null) {
            File fileA0O = C3cG.A0O(C3cG.A0O(context.getFilesDir(), HatchVoiceAvatarStoreKt.VOICE_AVATAR_DIR), ((CH0) this.userSession).A01);
            String strA0U = FGI.A0U("avatar-", HatchVoiceAvatarStoreKt.avatarCacheKey(hxE.first, hxE.second, str), "-");
            File[] fileArrListFiles = fileA0O.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (File file : fileArrListFiles) {
                    if (file.isFile()) {
                        String name = file.getName();
                        C7384Etj.A0U(name);
                        if (name.startsWith(strA0U)) {
                            arrayListA0h.add(file);
                        }
                    }
                }
                List listA0c = AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$cachedAvatarFileFor$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return C3cJ.A04(t2, t);
                    }
                });
                if (listA0c != null) {
                    Iterator it = listA0c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        File file2 = (File) next;
                        C7384Etj.A0X(file2);
                        if (str2.equals(HatchVoiceAvatarStoreKt.sha1HexOfFile(file2))) {
                            break;
                        }
                    }
                    File file3 = (File) next;
                    if (file3 != null) {
                        return file3.getAbsolutePath();
                    }
                }
            }
        }
        return null;
    }

    public final String currentVoiceAvatarPath(HxE<String, String> hxE) {
        String strCurrentVoiceAvatarPathLocked;
        C7384Etj.A0Y(hxE, 0);
        synchronized (this.filesLock) {
            strCurrentVoiceAvatarPathLocked = currentVoiceAvatarPathLocked(hxE);
        }
        return strCurrentVoiceAvatarPathLocked;
    }

    public final void releaseAvatarFile(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.filesLock) {
            String absolutePath = new File(str).getAbsolutePath();
            Integer num = this.retainedPaths.get(absolutePath);
            if (num != null) {
                int iIntValue = num.intValue();
                Map<String, Integer> map = this.retainedPaths;
                if (iIntValue == 1) {
                    map.remove(absolutePath);
                } else {
                    map.put(absolutePath, Integer.valueOf(iIntValue - 1));
                }
            }
        }
        pruneFiles(this.scope);
    }

    public final void restartCurrentAvatarDownloadIfUnavailable() {
        Long value;
        String strCurrentVoiceAvatarPath = currentVoiceAvatarPath(liveVm());
        if (strCurrentVoiceAvatarPath == null || !new File(strCurrentVoiceAvatarPath).isFile()) {
            BLG<Long> blg = this.downloadRetry;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, Long.valueOf(C3cG.A05(value) + 1)));
        }
    }

    public final boolean retainCachedAvatarFile(String str) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        synchronized (this.filesLock) {
            String absolutePath = new File(str).getAbsolutePath();
            z = false;
            if (new File(absolutePath).isFile() && !this.deletingPaths.contains(absolutePath) && !this.inFlightPaths.contains(absolutePath)) {
                Map<String, Integer> map = this.retainedPaths;
                C7384Etj.A0X(absolutePath);
                map.put(absolutePath, Integer.valueOf(AnonymousClass001.A0F(map.getOrDefault(absolutePath, 0)) + 1));
                z = true;
            }
        }
        return z;
    }

    public final String stillSha1(String str) {
        C7384Etj.A0Y(str, 0);
        return HatchVoiceAvatarStoreKt.sha1HexOfFile(new File(str));
    }

    public final VoiceAvatarStillSource stillSourceFor(String str) {
        VoiceAvatarStillSource voiceAvatarStillSource;
        C7384Etj.A0Y(str, 0);
        synchronized (this.filesLock) {
            HxE<String, String> hxEStillSource = stillSource();
            String str2 = hxEStillSource.first;
            String str3 = hxEStillSource.second;
            String strCurrentVoiceAvatarPathLocked = currentVoiceAvatarPathLocked(liveVm());
            voiceAvatarStillSource = null;
            String absolutePath = strCurrentVoiceAvatarPathLocked != null ? new File(strCurrentVoiceAvatarPathLocked).getAbsolutePath() : null;
            if (str2 != null && str3 != null && C7384Etj.areEqual(absolutePath, new File(str).getAbsolutePath())) {
                voiceAvatarStillSource = new VoiceAvatarStillSource(str2, str3);
            }
        }
        return voiceAvatarStillSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String cachedAvatarFileFor$default(HatchVoiceAvatarStore hatchVoiceAvatarStore, String str, String str2, HxE hxE, int i, Object obj) {
        if ((i & 4) != 0) {
            hxE = hatchVoiceAvatarStore.liveVm();
        }
        return hatchVoiceAvatarStore.cachedAvatarFileFor(str, str2, hxE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String currentVoiceAvatarPath$default(HatchVoiceAvatarStore hatchVoiceAvatarStore, HxE hxE, int i, Object obj) {
        if ((i & 1) != 0) {
            hxE = hatchVoiceAvatarStore.liveVm();
        }
        return hatchVoiceAvatarStore.currentVoiceAvatarPath(hxE);
    }

    private final String currentVoiceAvatarPathLocked(HxE<String, String> hxE) {
        String path;
        String strAvatarCacheKey = HatchVoiceAvatarStoreKt.avatarCacheKey(hxE.first, hxE.second, stillSource().second);
        Uri value = this._currentAvatarUri.getValue();
        if (value != null && (path = value.getPath()) != null && new File(path).isFile() && C7384Etj.areEqual(this.currentCacheKey, strAvatarCacheKey) && C7384Etj.areEqual(this.currentVm, hxE)) {
            return path;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:38:0x00dc, B:40:0x00ec], limit reached: 151 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[Catch: Exception -> 0x013a, CancellationException -> 0x0230, TryCatch #7 {CancellationException -> 0x0230, Exception -> 0x013a, blocks: (B:16:0x004a, B:21:0x00a3, B:23:0x00a9, B:25:0x00af, B:27:0x00b5, B:29:0x00bb, B:30:0x00be, B:32:0x00c4, B:34:0x00c7, B:35:0x00cf, B:41:0x00ed, B:47:0x0104, B:48:0x0106, B:50:0x0110, B:52:0x0113, B:68:0x0138, B:69:0x0139, B:63:0x0130, B:58:0x011f, B:59:0x0121, B:61:0x012b, B:62:0x012c, B:65:0x0135, B:20:0x00a0), top: B:143:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: Exception -> 0x013a, CancellationException -> 0x0230, TryCatch #7 {CancellationException -> 0x0230, Exception -> 0x013a, blocks: (B:16:0x004a, B:21:0x00a3, B:23:0x00a9, B:25:0x00af, B:27:0x00b5, B:29:0x00bb, B:30:0x00be, B:32:0x00c4, B:34:0x00c7, B:35:0x00cf, B:41:0x00ed, B:47:0x0104, B:48:0x0106, B:50:0x0110, B:52:0x0113, B:68:0x0138, B:69:0x0139, B:63:0x0130, B:58:0x011f, B:59:0x0121, B:61:0x012b, B:62:0x012c, B:65:0x0135, B:20:0x00a0), top: B:143:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[Catch: Exception -> 0x013a, CancellationException -> 0x0230, TryCatch #7 {CancellationException -> 0x0230, Exception -> 0x013a, blocks: (B:16:0x004a, B:21:0x00a3, B:23:0x00a9, B:25:0x00af, B:27:0x00b5, B:29:0x00bb, B:30:0x00be, B:32:0x00c4, B:34:0x00c7, B:35:0x00cf, B:41:0x00ed, B:47:0x0104, B:48:0x0106, B:50:0x0110, B:52:0x0113, B:68:0x0138, B:69:0x0139, B:63:0x0130, B:58:0x011f, B:59:0x0121, B:61:0x012b, B:62:0x012c, B:65:0x0135, B:20:0x00a0), top: B:143:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x014c -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x016c -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadAndCacheAvatar(com.facebook.aura.partners.voice.avatar.AvatarRequest r23, X.HtJ<? super kotlin.Unit> r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore.downloadAndCacheAvatar(com.facebook.aura.partners.voice.avatar.AvatarRequest, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HxE<String, String> liveVm() {
        return C3cH.A0q(this.gatewayPrefs, this.gatewayPrefs.getGatewayUrl());
    }

    public static /* synthetic */ void pruneFiles$default(HatchVoiceAvatarStore hatchVoiceAvatarStore, C3UX c3ux, int i, Object obj) {
        if ((i & 1) != 0) {
            c3ux = hatchVoiceAvatarStore.scope;
        }
        hatchVoiceAvatarStore.pruneFiles(c3ux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshAvatar(AvatarRequest avatarRequest, HtJ<? super Unit> htJ) {
        Unit unit;
        Object objDownloadAndCacheAvatar;
        synchronized (this.filesLock) {
            if (!C7384Etj.areEqual(avatarRequest.cacheKey, this.currentCacheKey) || !C7384Etj.areEqual(avatarRequest.vm, this.currentVm)) {
                this._currentAvatarUri.Af8(null);
            } else if (avatarRequest.isCommitted) {
                this.currentRefresh = avatarRequest.refresh;
            }
            unit = Unit.INSTANCE;
        }
        return (avatarRequest.isCommitted && avatarRequest.url != null && (objDownloadAndCacheAvatar = downloadAndCacheAvatar(avatarRequest, htJ)) == EnumC10460Hji.A02) ? objDownloadAndCacheAvatar : unit;
    }

    private final boolean retainCurrentAvatarFileLocked(String str, HxE<String, String> hxE) {
        File file = new File(str);
        String strCurrentVoiceAvatarPathLocked = currentVoiceAvatarPathLocked(hxE);
        if (!C7384Etj.areEqual(file.getAbsolutePath(), strCurrentVoiceAvatarPathLocked != null ? new File(strCurrentVoiceAvatarPathLocked).getAbsolutePath() : null) || !file.isFile() || this.deletingPaths.contains(file.getAbsolutePath()) || this.inFlightPaths.contains(file.getAbsolutePath())) {
            return false;
        }
        Map<String, Integer> map = this.retainedPaths;
        String absolutePath = file.getAbsolutePath();
        Map<String, Integer> map2 = this.retainedPaths;
        String absolutePath2 = file.getAbsolutePath();
        C7384Etj.A0U(absolutePath2);
        map.put(absolutePath, Integer.valueOf(AnonymousClass001.A0F(map2.getOrDefault(absolutePath2, 0)) + 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HxE<String, String> stillSource() {
        AiIdentity value = this.gateway.getAiIdentity().getValue();
        if (value == null) {
            return new HxE<>(null, null);
        }
        HxE<String, String> value2 = this.preferredStill.getValue();
        return value2 == null ? AvatarMediaUrlsKt.selectedStill(value, this.userSession, false) : value2;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        synchronized (this.filesLock) {
            this._currentAvatarUri.Af8(null);
            this.currentCacheKey = null;
            this.currentRefresh = -1L;
            this.currentVm = null;
            this.retainedPaths.clear();
        }
        pruneFiles(Hxb.A02(AnonymousClass001.A0y()));
    }

    public final C1BN<Uri> getCurrentAvatarUri() {
        return this.currentAvatarUri;
    }

    public final void preferStill(String str, String str2) {
        this.preferredStill.Af8((str == null || str2 == null) ? null : C3cG.A0r(str, str2));
    }

    public final class Companion {
        public final HatchVoiceAvatarStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVoiceAvatarStore) abstractC3358CGz.A03(HatchVoiceAvatarStore.class, new HatchVoiceAvatarStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchVoiceAvatarStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.gateway = companion;
        this.gatewayPrefs = C3cG.A0D(abstractC3358CGz);
        HzC hzCA0x = C3cH.A0x(AnonymousClass001.A0y());
        this.scope = hzCA0x;
        this.downloadRetry = C3cG.A14(0L);
        this.filesLock = C3cG.A0T();
        this.retainedPaths = C3cG.A0j();
        this.inFlightPaths = C3cG.A0k();
        this.deletingPaths = C3cG.A0k();
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._currentAvatarUri = c9286GCnA14;
        this.preferredStill = C3cG.A14(hrH);
        this.currentAvatarUri = C3cG.A11(c9286GCnA14);
        this.currentRefresh = -1L;
        AnonymousClass001.A1J(new AnonymousClass1(C3rb.A03(HatchVoiceAvatarStore$generations$1.INSTANCE, companion.getIdentityInvalidationGeneration(), companion.getIdentityRefreshGeneration()), GDB.A01(new HatchVoiceAvatarStore$special$$inlined$map$1(companion.gatewayState, this)), null), hzCA0x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void deleteFileIfUnused(java.io.File r5) {
        /*
            r4 = this;
            java.lang.String r3 = r5.getAbsolutePath()
            java.lang.Object r2 = r4.filesLock
            monitor-enter(r2)
            X.BLG<android.net.Uri> r0 = r4._currentAvatarUri     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L62
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L40
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L62
        L20:
            boolean r0 = X.C7384Etj.areEqual(r3, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L45
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.retainedPaths     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L45
            java.util.Set<java.lang.String> r0 = r4.inFlightPaths     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L45
            java.util.Set<java.lang.String> r0 = r4.deletingPaths     // Catch: java.lang.Throwable -> L62
            X.C7384Etj.A0X(r3)     // Catch: java.lang.Throwable -> L62
            boolean r1 = r0.add(r3)     // Catch: java.lang.Throwable -> L62
            goto L42
        L40:
            r0 = 0
            goto L20
        L42:
            r0 = 1
            if (r1 != 0) goto L46
        L45:
            r0 = 0
        L46:
            monitor-exit(r2)
            if (r0 == 0) goto L61
            r5.delete()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r4.filesLock
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r4.deletingPaths     // Catch: java.lang.Throwable -> L62
            r0.remove(r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r2)
            return
        L56:
            r1 = move-exception
            java.lang.Object r2 = r4.filesLock
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r4.deletingPaths     // Catch: java.lang.Throwable -> L62
            r0.remove(r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r2)
            throw r1
        L61:
            return
        L62:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore.deleteFileIfUnused(java.io.File):void");
    }

    public static final boolean downloadAndCacheAvatar$isCurrent(C78T c78t, AvatarRequest avatarRequest, HatchVoiceAvatarStore hatchVoiceAvatarStore) {
        if (HzS.A06(c78t)) {
            if (C7384Etj.areEqual(avatarRequest.vm, C3cH.A0q(hatchVoiceAvatarStore.gatewayPrefs, hatchVoiceAvatarStore.gatewayPrefs.getGatewayUrl())) && C7384Etj.areEqual(hatchVoiceAvatarStore.stillSource().first, avatarRequest.url) && C3cH.A09(hatchVoiceAvatarStore.gateway.getIdentityInvalidationGeneration()) == avatarRequest.refresh && C3cH.A09(hatchVoiceAvatarStore.gateway.getIdentityRefreshGeneration()) == avatarRequest.refresh && AuraSessionManager.INSTANCE.isCurrentSession(hatchVoiceAvatarStore.userSession)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean downloadAndCacheAvatar$publishLocked(HatchVoiceAvatarStore hatchVoiceAvatarStore, AvatarRequest avatarRequest, C78T c78t, File file) {
        String absolutePath = file.getAbsolutePath();
        if (!downloadAndCacheAvatar$isCurrent(c78t, avatarRequest, hatchVoiceAvatarStore) || !file.isFile() || hatchVoiceAvatarStore.deletingPaths.contains(absolutePath) || hatchVoiceAvatarStore.inFlightPaths.contains(absolutePath)) {
            return false;
        }
        hatchVoiceAvatarStore.currentCacheKey = avatarRequest.cacheKey;
        hatchVoiceAvatarStore.currentRefresh = avatarRequest.refresh;
        hatchVoiceAvatarStore.currentVm = avatarRequest.vm;
        hatchVoiceAvatarStore._currentAvatarUri.Af8(Uri.fromFile(file));
        return true;
    }

    public final boolean retainCurrentAvatarFile(String str, HxE<String, String> hxE) {
        boolean zRetainCurrentAvatarFileLocked;
        AnonymousClass003.A0u(str, hxE);
        synchronized (this.filesLock) {
            zRetainCurrentAvatarFileLocked = retainCurrentAvatarFileLocked(str, hxE);
        }
        return zRetainCurrentAvatarFileLocked;
    }

    public /* synthetic */ HatchVoiceAvatarStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri retainCurrentAvatarFile() {
        /*
            r5 = this;
            java.lang.Object r4 = r5.filesLock
            monitor-enter(r4)
            X.BLG<android.net.Uri> r0 = r5._currentAvatarUri     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Throwable -> L22
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r3 == 0) goto L1f
            java.lang.String r1 = r3.getPath()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1f
            X.HxE r0 = r5.liveVm()     // Catch: java.lang.Throwable -> L22
            boolean r0 = r5.retainCurrentAvatarFileLocked(r1, r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            monitor-exit(r4)
            return r3
        L22:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore.retainCurrentAvatarFile():android.net.Uri");
    }
}
