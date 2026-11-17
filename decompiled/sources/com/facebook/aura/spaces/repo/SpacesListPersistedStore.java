package com.facebook.aura.spaces.repo;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cJ;
import X.C60Q;
import X.C7384Etj;
import X.C9sU;
import X.CFK;
import X.CFP;
import X.DCl;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.file.core.HatchLocalFileStore;
import com.facebook.aura.json.HatchJsonKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.SerializationException;

/* loaded from: classes3.dex */
public final class SpacesListPersistedStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String DIR_NAME = "spaces";
    public static final String FILE_NAME = "list.json";
    public static final String TAG = "SpacesListPersistedStore";
    public final ReentrantLock lock;

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.SpacesListPersistedStore", f = "SpacesListPersistedStore.kt", l = {122}, m = "clear", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpacesListPersistedStore.this.clear(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$2", f = "SpacesListPersistedStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesListPersistedStore.this.new AnonymousClass2(htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<Object> htJ) {
            return SpacesListPersistedStore.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objValueOf;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesListPersistedStore spacesListPersistedStore = SpacesListPersistedStore.this;
            ReentrantLock reentrantLock = spacesListPersistedStore.lock;
            reentrantLock.lock();
            try {
                try {
                    objValueOf = Boolean.valueOf(spacesListPersistedStore.getFile().delete());
                } catch (Exception e) {
                    C3cG.A1G("Failed to clear persisted list: ", e.getMessage(), SpacesListPersistedStore.TAG);
                    objValueOf = Unit.INSTANCE;
                }
                return objValueOf;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
            return invoke2(c3ux, (HtJ<Object>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.SpacesListPersistedStore$load$2", f = "SpacesListPersistedStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.SpacesListPersistedStore$load$2, reason: invalid class name and case insensitive filesystem */
    public final class C139272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AHD<? extends SpaceCard>>, Object> {
        public int label;

        public C139272(HtJ<? super C139272> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesListPersistedStore.this.new C139272(htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super AHD<SpaceCard>> htJ) {
            return SpacesListPersistedStore.this.new C139272(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesListPersistedStore spacesListPersistedStore = SpacesListPersistedStore.this;
            ReentrantLock reentrantLock = spacesListPersistedStore.lock;
            reentrantLock.lock();
            try {
                File file = spacesListPersistedStore.getFile();
                AHD ahdA07 = null;
                if (file.exists()) {
                    try {
                        C9sU c9sU = HatchJsonKt.HatchJson;
                        String strA04 = CFP.A04(file, DCl.A05);
                        int i = PersistedSpacesListJson.SCHEMA_VERSION;
                        PersistedSpacesListJson persistedSpacesListJson = (PersistedSpacesListJson) c9sU.A00(strA04, PersistedSpacesListJson$$serializer.INSTANCE);
                        int i2 = persistedSpacesListJson.version;
                        if (i2 != 2) {
                            CFK.A05(SpacesListPersistedStore.TAG, FGI.A0H("Discarding persisted list with version ", i2));
                            file.delete();
                        } else {
                            List<PersistedSpaceCardJson> list = persistedSpacesListJson.cards;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                            Iterator<PersistedSpaceCardJson> it = list.iterator();
                            while (it.hasNext()) {
                                arrayListA0i.add(SpacesListPersistedStoreKt.toDomain(it.next()));
                            }
                            ahdA07 = AGI.A07(arrayListA0i);
                        }
                    } catch (SerializationException e) {
                        C3cG.A1G("Failed to decode persisted list, discarding: ", e.getMessage(), SpacesListPersistedStore.TAG);
                        file.delete();
                    } catch (Exception e2) {
                        C3cG.A1G("Failed to read persisted list: ", e2.getMessage(), SpacesListPersistedStore.TAG);
                    }
                }
                return ahdA07;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super AHD<? extends SpaceCard>> htJ) {
            return invoke2(c3ux, (HtJ<? super AHD<SpaceCard>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.SpacesListPersistedStore$save$2", f = "SpacesListPersistedStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.SpacesListPersistedStore$save$2, reason: invalid class name and case insensitive filesystem */
    public final class C139282 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<SpaceCard> $cards;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139282(List<SpaceCard> list, HtJ<? super C139282> htJ) {
            super(2, htJ);
            this.$cards = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesListPersistedStore.this.new C139282(this.$cards, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesListPersistedStore spacesListPersistedStore = SpacesListPersistedStore.this;
            ReentrantLock reentrantLock = spacesListPersistedStore.lock;
            List<SpaceCard> list = this.$cards;
            reentrantLock.lock();
            try {
                File file = spacesListPersistedStore.getFile();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    Iterator<SpaceCard> it = list.iterator();
                    while (it.hasNext()) {
                        arrayListA0i.add(SpacesListPersistedStoreKt.toPersisted(it.next()));
                    }
                    HatchLocalFileStore.INSTANCE.writeText(file, HatchJsonKt.HatchJson.A02(new PersistedSpacesListJson(2, jCurrentTimeMillis, arrayListA0i), PersistedSpacesListJson$$serializer.INSTANCE));
                } catch (Exception e) {
                    C3cG.A1G("Failed to persist spaces list: ", e.getMessage(), SpacesListPersistedStore.TAG);
                }
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139282) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.SpacesListPersistedStore$updatePwaCompliance$2", f = "SpacesListPersistedStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.SpacesListPersistedStore$updatePwaCompliance$2, reason: invalid class name and case insensitive filesystem */
    public final class C139292 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $isPwaCompliant;
        public final /* synthetic */ String $spaceId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139292(String str, boolean z, HtJ<? super C139292> htJ) {
            super(2, htJ);
            this.$spaceId = str;
            this.$isPwaCompliant = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesListPersistedStore.this.new C139292(this.$spaceId, this.$isPwaCompliant, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            r0 = r1.cards;
            r8 = X.AnonymousClass003.A0i(r0);
            r7 = r0.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
            if (r7.hasNext() == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        
            r11 = r7.next();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (X.C7384Etj.areEqual(r11.id, r5) == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        
            r11 = com.facebook.aura.spaces.repo.PersistedSpaceCardJson.copy$default(r11, null, null, null, null, null, null, null, null, null, null, null, null, false, null, java.lang.Boolean.valueOf(r2), 16383, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        
            r8.add(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        
            r2 = r9.A02(new com.facebook.aura.spaces.repo.PersistedSpacesListJson(r1.version, r1.saved_at_ms, r8), r10);
            r1 = X.C3cG.A0O(r3.getParentFile(), "list.json.tmp");
            X.CFP.A05(r1, r2, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
        
            if (r1.renameTo(r3) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
        
            X.CEV.A02(r1, r3);
            r1.delete();
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                r27 = this;
                r1 = r27
                int r0 = r1.label
                if (r0 != 0) goto Ldc
                X.Hwg.A00(r28)
                com.facebook.aura.spaces.repo.SpacesListPersistedStore r0 = com.facebook.aura.spaces.repo.SpacesListPersistedStore.this
                java.util.concurrent.locks.ReentrantLock r4 = r0.lock
                java.lang.String r5 = r1.$spaceId
                boolean r2 = r1.$isPwaCompliant
                r4.lock()
                java.io.File r3 = com.facebook.aura.spaces.repo.SpacesListPersistedStore.access$getFile(r0)     // Catch: java.lang.Throwable -> Ld7
                boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> Ld7
                if (r0 == 0) goto Ld1
                X.9sU r9 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                r12 = 0
                java.nio.charset.Charset r6 = X.DCl.A05     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.lang.String r1 = X.CFP.A04(r3, r6)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                int r0 = com.facebook.aura.spaces.repo.PersistedSpacesListJson.SCHEMA_VERSION     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                com.facebook.aura.spaces.repo.PersistedSpacesListJson$$serializer r10 = com.facebook.aura.spaces.repo.PersistedSpacesListJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.lang.Object r1 = r9.A00(r1, r10)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                com.facebook.aura.spaces.repo.PersistedSpacesListJson r1 = (com.facebook.aura.spaces.repo.PersistedSpacesListJson) r1     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.util.List<com.facebook.aura.spaces.repo.PersistedSpaceCardJson> r7 = r1.cards     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                boolean r0 = r7 instanceof java.util.Collection     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 == 0) goto L3f
                boolean r0 = r7.isEmpty()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 == 0) goto L3f
                goto Ld1
            L3f:
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
            L43:
                boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 == 0) goto Ld1
                java.lang.Object r0 = r7.next()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                com.facebook.aura.spaces.repo.PersistedSpaceCardJson r0 = (com.facebook.aura.spaces.repo.PersistedSpaceCardJson) r0     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.lang.String r0 = r0.id     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                boolean r0 = X.C7384Etj.areEqual(r0, r5)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 == 0) goto L43
                java.util.List<com.facebook.aura.spaces.repo.PersistedSpaceCardJson> r0 = r1.cards     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.util.ArrayList r8 = X.AnonymousClass003.A0i(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
            L61:
                boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 == 0) goto L9c
                java.lang.Object r11 = r7.next()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                com.facebook.aura.spaces.repo.PersistedSpaceCardJson r11 = (com.facebook.aura.spaces.repo.PersistedSpaceCardJson) r11     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.lang.String r0 = r11.id     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                boolean r0 = X.C7384Etj.areEqual(r0, r5)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 == 0) goto L98
                java.lang.Boolean r26 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                r27 = 16383(0x3fff, float:2.2957E-41)
                r24 = 0
                r13 = r12
                r14 = r12
                r15 = r12
                r16 = r12
                r17 = r12
                r18 = r12
                r19 = r12
                r20 = r12
                r21 = r12
                r22 = r12
                r23 = r12
                r25 = r12
                r28 = r12
                com.facebook.aura.spaces.repo.PersistedSpaceCardJson r11 = com.facebook.aura.spaces.repo.PersistedSpaceCardJson.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
            L98:
                r8.add(r11)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                goto L61
            L9c:
                int r7 = r1.version     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                long r0 = r1.saved_at_ms     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                com.facebook.aura.spaces.repo.PersistedSpacesListJson r2 = new com.facebook.aura.spaces.repo.PersistedSpacesListJson     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                r2.<init>(r7, r0, r8)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.lang.String r2 = r9.A02(r2, r10)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.io.File r1 = r3.getParentFile()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                java.lang.String r0 = "list.json.tmp"
                java.io.File r1 = X.C3cG.A0O(r1, r0)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                X.CFP.A05(r1, r2, r6)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                boolean r0 = r1.renameTo(r3)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                if (r0 != 0) goto Ld1
                X.CEV.A02(r1, r3)     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                r1.delete()     // Catch: java.lang.Exception -> Lc3 java.lang.Throwable -> Ld7
                goto Ld1
            Lc3:
                r0 = move-exception
                java.lang.String r3 = "SpacesListPersistedStore"
                java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> Ld7
                java.lang.String r1 = "Failed to update PWA flag for "
                java.lang.String r0 = ": "
                X.C60Q.A1K(r1, r5, r0, r2, r3)     // Catch: java.lang.Throwable -> Ld7
            Ld1:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld7
                r4.unlock()
                return r0
            Ld7:
                r0 = move-exception
                r4.unlock()
                throw r0
            Ldc:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.SpacesListPersistedStore.C139292.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139292) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.spaces.repo.SpacesListPersistedStore.AnonymousClass1
            if (r0 == 0) goto L36
            r5 = r7
            com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$1 r5 = (com.facebook.aura.spaces.repo.SpacesListPersistedStore.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3c
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$2 r0 = new com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L36:
            com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$1 r5 = new com.facebook.aura.spaces.repo.SpacesListPersistedStore$clear$1
            r5.<init>(r7)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.SpacesListPersistedStore.clear(X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        String strA00 = C3cF.A00(30);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            try {
                getFile().delete();
            } catch (Exception e) {
                C60Q.A1K(strA00, getFile().getPath(), ": ", e.getMessage(), TAG);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final class Companion {
        public final SpacesListPersistedStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SpacesListPersistedStore) abstractC3358CGz.A03(SpacesListPersistedStore.class, SpacesListPersistedStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return C3cG.A0O(C3cG.A0O(C3cG.A06().getFilesDir(), "spaces"), FILE_NAME);
    }

    public final Object load(HtJ<? super AHD<SpaceCard>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C139272(null));
    }

    public final Object save(List<SpaceCard> list, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C139282(list, null));
    }

    public final Object updatePwaCompliance(String str, boolean z, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C139292(str, z, null));
    }

    public /* synthetic */ SpacesListPersistedStore(C06H c06h) {
        this();
    }

    public SpacesListPersistedStore() {
        this.lock = new ReentrantLock();
    }
}
