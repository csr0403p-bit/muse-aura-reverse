package com.facebook.aura.spaces.cache;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFI;
import X.BQG;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.C8eO;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.CEV;
import X.CFK;
import X.CFP;
import X.DCl;
import X.EnumC10460Hji;
import X.F0H;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hu0;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.HzS;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.file.core.AtomicFileWriter;
import com.facebook.aura.file.core.HatchLocalFileStore;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.spaces.cache.SpacesDiskCache;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.Serializable;

/* loaded from: classes2.dex */
public final class SpacesDiskCache implements InterfaceC7549F2g {
    public static final String BLOBS_DIR_NAME = "blobs";
    public static final Companion Companion = new Companion();
    public static final long MAX_DISK_BYTES = 52428800;
    public static final int MAX_DISK_ENTRIES = 256;
    public static final long MAX_ENTRY_BYTES = 8388608;
    public static final long MAX_IN_MEMORY_READ_BYTES = 2097152;
    public static final String META_DIR_NAME = "blobs_meta";
    public static final long REFRESH_COOLDOWN_MS = 300000;
    public static final String ROOT_DIR_NAME = "spaces";
    public static final int SHARD_PREFIX_LEN = 2;
    public static final String TAG = "SpacesDiskCache";
    public final ConcurrentHashMap<String, Long> lastRefreshAtMs;
    public final ReentrantLock lock;
    public final SingleFlight refreshFlight;
    public final C3UX refreshScope;
    public long trackedBytes;
    public int trackedEntries;

    @Serializable
    public final class AssetMetaJson extends C06G {
        public static final Companion Companion = new Companion();
        public final long bytes;
        public final long last_access_ms;
        public final String mime;
        public final String url;

        public final class Companion {
            public final C9hr<AssetMetaJson> serializer() {
                return SpacesDiskCache$AssetMetaJson$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public AssetMetaJson(String str, String str2, long j, long j2) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
            this.mime = str2;
            this.bytes = j;
            this.last_access_ms = j2;
        }

        public static /* synthetic */ AssetMetaJson copy$default(AssetMetaJson assetMetaJson, String str, String str2, long j, long j2, int i, Object obj) {
            String str3 = str;
            String str4 = str2;
            long j3 = j;
            long j4 = j2;
            if ((i & 1) != 0) {
                str3 = assetMetaJson.url;
            }
            if ((i & 2) != 0) {
                str4 = assetMetaJson.mime;
            }
            if ((i & 4) != 0) {
                j3 = assetMetaJson.bytes;
            }
            if ((i & 8) != 0) {
                j4 = assetMetaJson.last_access_ms;
            }
            C7384Etj.A0Y(str3, 0);
            return new AssetMetaJson(str3, str4, j3, j4);
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_cache_cache(AssetMetaJson assetMetaJson, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(assetMetaJson.url, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || assetMetaJson.mime != null) {
                c9j5.AAP(assetMetaJson.mime, C07779iq.A01, c9iZ, 1);
            }
            if (zAfR || assetMetaJson.bytes != 0) {
                c9j5.AAN(c9iZ, 2, assetMetaJson.bytes);
            }
            if (zAfR || assetMetaJson.last_access_ms != 0) {
                c9j5.AAN(c9iZ, 3, assetMetaJson.last_access_ms);
            }
        }

        public final AssetMetaJson copy(String str, String str2, long j, long j2) {
            C7384Etj.A0Y(str, 0);
            return new AssetMetaJson(str, str2, j, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AssetMetaJson) {
                    AssetMetaJson assetMetaJson = (AssetMetaJson) obj;
                    if (!C7384Etj.areEqual(this.url, assetMetaJson.url) || !C7384Etj.areEqual(this.mime, assetMetaJson.mime) || this.bytes != assetMetaJson.bytes || this.last_access_ms != assetMetaJson.last_access_ms) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.mime;
        }

        public final long component3() {
            return this.bytes;
        }

        public final long component4() {
            return this.last_access_ms;
        }

        public final long getBytes() {
            return this.bytes;
        }

        public final long getLast_access_ms() {
            return this.last_access_ms;
        }

        public final String getMime() {
            return this.mime;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass006.A06(this.bytes, (AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.mime)) * 31) + C3cG.A02(this.last_access_ms);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ AssetMetaJson(int i, String str, String str2, long j, long j2, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(SpacesDiskCache$AssetMetaJson$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.url = str;
            this.mime = (i & 2) == 0 ? null : str2;
            if ((i & 4) == 0) {
                this.bytes = 0L;
            } else {
                this.bytes = j;
            }
            if ((i & 8) == 0) {
                this.last_access_ms = 0L;
            } else {
                this.last_access_ms = j2;
            }
        }

        public /* synthetic */ AssetMetaJson(String str, String str2, long j, long j2, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2), C3cH.A03(i & 4, j), C3cH.A03(i & 8, j2));
        }
    }

    public final class AssetWriter implements Closeable {
        public long bytesWritten;
        public final AtomicFileWriter file;
        public final String mime;
        public boolean rejected;
        public final /* synthetic */ SpacesDiskCache this$0;
        public final String url;

        public AssetWriter(SpacesDiskCache spacesDiskCache, String str, String str2, AtomicFileWriter atomicFileWriter) {
            AnonymousClass002.A1B(str, 1, atomicFileWriter);
            this.this$0 = spacesDiskCache;
            this.url = str;
            this.mime = str2;
            this.file = atomicFileWriter;
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            C7384Etj.A0Y(bArr, 0);
            ensureCapacity(i2);
            this.file.write(bArr, i, i2);
            this.bytesWritten += i2;
        }

        private final void ensureCapacity(int i) throws IOException {
            if (this.rejected || this.bytesWritten + i > 8388608) {
                this.rejected = true;
                this.file.close();
                throw new IOException("Spaces disk-cache entry exceeds 8388608B");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.file.close();
        }

        public final boolean commit() {
            SpacesDiskCache spacesDiskCache = this.this$0;
            ReentrantLock reentrantLock = spacesDiskCache.lock;
            reentrantLock.lock();
            try {
                boolean z = false;
                if (!this.rejected) {
                    String strUrlKey = SpacesDiskCache.Companion.urlKey(this.url);
                    File fileBlobFile = spacesDiskCache.blobFile(strUrlKey);
                    Long lValueOf = fileBlobFile.exists() ? Long.valueOf(fileBlobFile.length()) : null;
                    if (!this.file.commit()) {
                        C3cG.A1G("Failed to commit streamed blob for ", this.url, SpacesDiskCache.TAG);
                    } else if (spacesDiskCache.writeMeta(strUrlKey, new AssetMetaJson(this.url, this.mime, this.bytesWritten, System.currentTimeMillis()))) {
                        spacesDiskCache.noteEntryWrittenLocked(this.bytesWritten, lValueOf);
                        z = true;
                    } else {
                        spacesDiskCache.blobFile(strUrlKey).delete();
                    }
                }
                return z;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final long getByteCount() {
            return this.bytesWritten;
        }

        public final void write(int i) throws IOException {
            ensureCapacity(1);
            this.file.write(i);
            this.bytesWritten++;
        }
    }

    /* loaded from: classes3.dex */
    public final class CachedAsset extends C06G {
        public final byte[] bytes;
        public final String mime;

        public CachedAsset(byte[] bArr, String str) {
            C7384Etj.A0Y(bArr, 0);
            this.bytes = bArr;
            this.mime = str;
        }

        public final CachedAsset copy(byte[] bArr, String str) {
            C7384Etj.A0Y(bArr, 0);
            return new CachedAsset(bArr, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CachedAsset) {
                    CachedAsset cachedAsset = (CachedAsset) obj;
                    if (!C7384Etj.areEqual(this.bytes, cachedAsset.bytes) || !C7384Etj.areEqual(this.mime, cachedAsset.mime)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CachedAsset copy$default(CachedAsset cachedAsset, byte[] bArr, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = cachedAsset.bytes;
            }
            if ((i & 2) != 0) {
                str = cachedAsset.mime;
            }
            C7384Etj.A0Y(bArr, 0);
            return new CachedAsset(bArr, str);
        }

        public final byte[] component1() {
            return this.bytes;
        }

        public final String component2() {
            return this.mime;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final String getMime() {
            return this.mime;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.bytes) * 31) + AnonymousClass006.A0G(this.mime);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CachedAssetStream implements Closeable {
        public final long bytes;
        public final String mime;
        public final InputStream stream;

        public CachedAssetStream(InputStream inputStream, String str, long j) {
            C7384Etj.A0Y(inputStream, 0);
            this.stream = inputStream;
            this.mime = str;
            this.bytes = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.stream.close();
        }

        public final long getBytes() {
            return this.bytes;
        }

        public final String getMime() {
            return this.mime;
        }

        public final InputStream getStream() {
            return this.stream;
        }

        public final byte[] readBytes(long j) {
            if (this.bytes > j) {
                return null;
            }
            return F0H.A01(this.stream);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache", f = "SpacesDiskCache.kt", l = {293}, m = "clear", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$clear$1, reason: invalid class name */
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
            return SpacesDiskCache.this.clear(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$clear$2", f = "SpacesDiskCache.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$clear$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesDiskCache.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
            return invoke2(c3ux, (HtJ<Object>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objValueOf;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesDiskCache spacesDiskCache = SpacesDiskCache.this;
            ReentrantLock reentrantLock = spacesDiskCache.lock;
            reentrantLock.lock();
            try {
                try {
                    objValueOf = Boolean.valueOf(CEV.A03(spacesDiskCache.getRootDir()));
                } catch (Exception e) {
                    C3cG.A1G("Failed to clear disk cache: ", e.getMessage(), SpacesDiskCache.TAG);
                    objValueOf = Unit.INSTANCE;
                }
                return objValueOf;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<Object> htJ) {
            return SpacesDiskCache.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$contains$2", f = "SpacesDiskCache.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$contains$2, reason: invalid class name and case insensitive filesystem */
    public final class C138822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138822(String str, HtJ<? super C138822> htJ) {
            super(2, htJ);
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesDiskCache.this.new C138822(this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesDiskCache spacesDiskCache = SpacesDiskCache.this;
            ReentrantLock reentrantLock = spacesDiskCache.lock;
            String str = this.$url;
            reentrantLock.lock();
            try {
                return Boolean.valueOf(spacesDiskCache.blobFile(SpacesDiskCache.Companion.urlKey(str)).exists());
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C138822) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$evictToCap$2", f = "SpacesDiskCache.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$evictToCap$2, reason: invalid class name and case insensitive filesystem */
    public final class C138832 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C138832(HtJ<? super C138832> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesDiskCache.this.new C138832(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesDiskCache spacesDiskCache = SpacesDiskCache.this;
            ReentrantLock reentrantLock = spacesDiskCache.lock;
            reentrantLock.lock();
            try {
                spacesDiskCache.evictToCapLocked();
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpacesDiskCache.this.new C138832(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$get$2", f = "SpacesDiskCache.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$get$2, reason: invalid class name and case insensitive filesystem */
    public final class C138842 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super CachedAsset>, Object> {
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138842(String str, HtJ<? super C138842> htJ) {
            super(2, htJ);
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesDiskCache.this.new C138842(this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return SpacesDiskCache.this.getBlocking(this.$url);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super CachedAsset> htJ) {
            return ((C138842) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$put$2", f = "SpacesDiskCache.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$put$2, reason: invalid class name and case insensitive filesystem */
    public final class C138852 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ byte[] $bytes;
        public final /* synthetic */ String $mime;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138852(String str, byte[] bArr, String str2, HtJ<? super C138852> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$bytes = bArr;
            this.$mime = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesDiskCache.this.new C138852(this.$url, this.$bytes, this.$mime, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(SpacesDiskCache.this.putBlocking(this.$url, this.$bytes, this.$mime));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C138852) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$refreshInBackground$1", f = "SpacesDiskCache.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$refreshInBackground$1, reason: invalid class name and case insensitive filesystem */
    public final class C138861 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $refresh;
        public final /* synthetic */ String $url;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.spaces.cache.SpacesDiskCache$refreshInBackground$1$1", f = "SpacesDiskCache.kt", l = {63}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.spaces.cache.SpacesDiskCache$refreshInBackground$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03781 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $refresh;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03781(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C03781> htJ) {
                super(1, htJ);
                this.$refresh = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03781(this.$refresh, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C03781(this.$refresh, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$refresh;
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
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138861(String str, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C138861> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$refresh = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpacesDiskCache.this.new C138861(this.$url, this.$refresh, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlight singleFlight = SpacesDiskCache.this.refreshFlight;
                String str = this.$url;
                C03781 c03781 = new C03781(this.$refresh, null);
                this.label = 1;
                if (singleFlight.invoke(str, c03781, this) == enumC10460Hji) {
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
            return ((C138861) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File blobFile(String str) {
        return C3cG.A0O(C3cG.A0O(getBlobsDir(), BQG.A17(str, 2)), str);
    }

    public final AssetWriter openWriter(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new AssetWriter(this, str, str2, HatchLocalFileStore.INSTANCE.openWriter(blobFile(Companion.urlKey(str))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void evictToCapLocked() {
        List<HxE> listA0c = AbstractC0878AGe.A0c(listMetas(), new Comparator() { // from class: com.facebook.aura.spaces.cache.SpacesDiskCache$evictToCapLocked$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((SpacesDiskCache.AssetMetaJson) ((HxE) t).second).last_access_ms).compareTo(Long.valueOf(((SpacesDiskCache.AssetMetaJson) ((HxE) t2).second).last_access_ms));
            }
        });
        ArrayList arrayList = new ArrayList(listA0c.size());
        long j = 0;
        for (HxE hxE : listA0c) {
            String str = (String) hxE.first;
            AssetMetaJson assetMetaJson = (AssetMetaJson) hxE.second;
            long length = blobFile(str).length();
            if (length > 8388608) {
                deleteEntry(str);
            } else {
                j += length;
                String str2 = assetMetaJson.url;
                String str3 = assetMetaJson.mime;
                long j2 = assetMetaJson.last_access_ms;
                C7384Etj.A0Y(str2, 0);
                AnonymousClass002.A1J(str, new AssetMetaJson(str2, str3, length, j2), arrayList);
            }
        }
        int size = arrayList.size();
        if (j > 52428800 || size > 256) {
            Iterator it = arrayList.iterator();
            C7384Etj.A0U(it);
            while (it.hasNext()) {
                Object next = it.next();
                C7384Etj.A0U(next);
                HxE hxE2 = (HxE) next;
                String str4 = (String) hxE2.first;
                AssetMetaJson assetMetaJson2 = (AssetMetaJson) hxE2.second;
                if (j <= 52428800 && size <= 256) {
                    break;
                }
                deleteEntry(str4);
                j -= assetMetaJson2.bytes;
                size--;
            }
        }
        this.trackedBytes = j;
        this.trackedEntries = size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void noteEntryWrittenLocked(long j, Long l) {
        long j2 = this.trackedBytes;
        if (j2 < 0) {
            recomputeTrackedTotalsLocked();
        } else if (l == null) {
            this.trackedBytes = j2 + j;
            this.trackedEntries++;
        } else {
            this.trackedBytes = j2 + (j - l.longValue());
        }
        if (this.trackedBytes > 52428800 || this.trackedEntries > 256) {
            evictToCapLocked();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.spaces.cache.SpacesDiskCache.AnonymousClass1
            if (r0 == 0) goto L36
            r5 = r7
            com.facebook.aura.spaces.cache.SpacesDiskCache$clear$1 r5 = (com.facebook.aura.spaces.cache.SpacesDiskCache.AnonymousClass1) r5
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
            com.facebook.aura.spaces.cache.SpacesDiskCache$clear$2 r0 = new com.facebook.aura.spaces.cache.SpacesDiskCache$clear$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L36:
            com.facebook.aura.spaces.cache.SpacesDiskCache$clear$1 r5 = new com.facebook.aura.spaces.cache.SpacesDiskCache$clear$1
            r5.<init>(r7)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.cache.SpacesDiskCache.clear(X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.refreshFlight.clearAndCancelAll();
        HzS.A04(this.refreshScope.AEA());
        this.lastRefreshAtMs.clear();
        try {
            CEV.A03(getRootDir());
        } catch (Exception e) {
            CFK.A06(TAG, FGI.A0d("clearUserData: failed to delete ", getRootDir().getPath(), ": ", e.getMessage()));
        }
    }

    public final CachedAsset getBlocking(String str) throws IOException {
        C7384Etj.A0Y(str, 0);
        CachedAssetStream cachedAssetStreamOpenStreamBlocking = openStreamBlocking(str);
        CachedAsset cachedAsset = null;
        if (cachedAssetStreamOpenStreamBlocking == null) {
            return null;
        }
        try {
            byte[] bytes = cachedAssetStreamOpenStreamBlocking.readBytes(2097152L);
            if (bytes == null) {
                CFK.A06(TAG, FGI.A0g("Cached asset for ", str, " is ", "B, above the 2097152B in-memory read cap; stream it instead", cachedAssetStreamOpenStreamBlocking.bytes));
            } else {
                cachedAsset = new CachedAsset(bytes, cachedAssetStreamOpenStreamBlocking.mime);
            }
            cachedAssetStreamOpenStreamBlocking.close();
            return cachedAsset;
        } finally {
        }
    }

    public final CachedAssetStream openStreamBlocking(String str) {
        C7384Etj.A0Y(str, 0);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            String strUrlKey = Companion.urlKey(str);
            File fileBlobFile = blobFile(strUrlKey);
            CachedAssetStream cachedAssetStream = null;
            if (fileBlobFile.exists()) {
                long length = fileBlobFile.length();
                if (length > 8388608) {
                    deleteEntry(strUrlKey);
                    CFK.A06(TAG, FGI.A0L("Discarded oversized cached asset (", length, "B) for ", str));
                } else {
                    AssetMetaJson meta2 = readMeta(strUrlKey);
                    String str2 = meta2 != null ? meta2.mime : null;
                    try {
                        touchAccess(strUrlKey, str, str2);
                        cachedAssetStream = new CachedAssetStream(new BufferedInputStream(new FileInputStream(fileBlobFile)), str2, length);
                    } catch (Exception e) {
                        CFK.A06(TAG, FGI.A0d("Failed to open blob for ", str, ": ", e.getMessage()));
                    }
                }
            }
            return cachedAssetStream;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0065 -> B:23:0x0074). Please report as a decompilation issue!!! */
    public final boolean putBlocking(String str, byte[] bArr, String str2) {
        AnonymousClass003.A0u(str, bArr);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            String strUrlKey = Companion.urlKey(str);
            File fileBlobFile = blobFile(strUrlKey);
            int length = bArr.length;
            long j = length;
            boolean z = false;
            if (j > 8388608) {
                deleteEntry(strUrlKey);
                CFK.A06(TAG, FGI.A0W("Skipping oversized disk-cache entry (", "B) for ", str, length));
            } else {
                Long lValueOf = fileBlobFile.exists() ? Long.valueOf(fileBlobFile.length()) : null;
                try {
                    HatchLocalFileStore.INSTANCE.writeBytes(fileBlobFile, bArr);
                    if (writeMeta(strUrlKey, new AssetMetaJson(str, str2, j, System.currentTimeMillis()))) {
                        noteEntryWrittenLocked(j, lValueOf);
                        z = true;
                    } else {
                        fileBlobFile.delete();
                    }
                } catch (Exception e) {
                    CFK.A06(TAG, FGI.A0d("Failed to write blob for ", str, ": ", e.getMessage()));
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final class Companion {
        public final SpacesDiskCache getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SpacesDiskCache) abstractC3358CGz.A03(SpacesDiskCache.class, new SpacesDiskCache$Companion$getInstance$1(abstractC3358CGz));
        }

        public final String urlKey(String str) {
            C7384Etj.A0Y(str, 0);
            byte[] bArrA1T = C3cH.A1T(str);
            C7384Etj.A0X(bArrA1T);
            return BFI.A0C("", SpacesDiskCache$Companion$urlKey$1.INSTANCE, bArrA1T);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpacesDiskCache(AbstractC3358CGz abstractC3358CGz) {
        this.lock = new ReentrantLock();
        this.refreshScope = Hxb.A02(C78W.A02(new C8eO(null), Hu0.A01(AuraExecutors.INSTANCE.createResponseStreamingSerialExecutor())));
        this.refreshFlight = C3cH.A0M();
        this.lastRefreshAtMs = new ConcurrentHashMap<>();
        this.trackedBytes = -1L;
    }

    private final void deleteEntry(String str) {
        blobFile(str).delete();
        metaFile(str).delete();
        this.trackedBytes = -1L;
    }

    private final File getBlobsDir() {
        return C3cG.A0O(getRootDir(), BLOBS_DIR_NAME);
    }

    private final File getMetaDir() {
        return C3cG.A0O(getRootDir(), META_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getRootDir() {
        return C3cG.A0O(C3cG.A06().getFilesDir(), "spaces");
    }

    private final List<HxE<String, AssetMetaJson>> listMetas() {
        File[] fileArrListFiles = getMetaDir().listFiles();
        if (fileArrListFiles == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            C7384Etj.A0U(name);
            HxE hxEA0r = null;
            if (name.endsWith(".json")) {
                String name2 = file.getName();
                C7384Etj.A0U(name2);
                try {
                    hxEA0r = C3cG.A0r(C7BY.A0L(".json", name2), (AssetMetaJson) HatchJsonKt.HatchJson.A00(CFP.A04(file, DCl.A05), SpacesDiskCache$AssetMetaJson$$serializer.INSTANCE));
                } catch (Exception unused) {
                }
            }
            if (hxEA0r != null) {
                arrayListA0h.add(hxEA0r);
            }
        }
        return arrayListA0h;
    }

    private final File metaFile(String str) {
        return C3cG.A0O(getMetaDir(), FGI.A0M(str, ".json"));
    }

    private final long nowMs() {
        return System.currentTimeMillis();
    }

    private final AssetMetaJson readMeta(String str) {
        File fileMetaFile = metaFile(str);
        if (!fileMetaFile.exists()) {
            return null;
        }
        try {
            return (AssetMetaJson) HatchJsonKt.HatchJson.A00(CFP.A04(fileMetaFile, DCl.A05), SpacesDiskCache$AssetMetaJson$$serializer.INSTANCE);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void recomputeTrackedTotalsLocked() {
        List<HxE<String, AssetMetaJson>> listListMetas = listMetas();
        this.trackedEntries = listListMetas.size();
        Iterator<HxE<String, AssetMetaJson>> it = listListMetas.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += blobFile(it.next().first).length();
        }
        this.trackedBytes = length;
    }

    private final void touchAccess(String str, String str2, String str3) {
        AssetMetaJson meta2 = readMeta(str);
        if (meta2 == null) {
            meta2 = new AssetMetaJson(str2, str3, blobFile(str).length(), 0L);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str4 = meta2.url;
        String str5 = meta2.mime;
        long j = meta2.bytes;
        C7384Etj.A0Y(str4, 0);
        writeMeta(str, new AssetMetaJson(str4, str5, j, jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeMeta(String str, AssetMetaJson assetMetaJson) {
        try {
            HatchLocalFileStore.INSTANCE.writeText(metaFile(str), HatchJsonKt.HatchJson.A02(assetMetaJson, SpacesDiskCache$AssetMetaJson$$serializer.INSTANCE));
            return true;
        } catch (Exception e) {
            CFK.A06(TAG, FGI.A0d("Failed to write meta for ", str, ": ", e.getMessage()));
            return false;
        }
    }

    public final Object contains(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138822(str, null));
    }

    public final Object evictToCap(HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C138832(null));
    }

    public final Object get(String str, HtJ<? super CachedAsset> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138842(str, null));
    }

    public final Object put(String str, byte[] bArr, String str2, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138852(str, bArr, str2, null));
    }

    public final void refreshInBackground(String str, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        AnonymousClass003.A0u(str, g0u);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.lastRefreshAtMs.get(str);
        if (l == null || jElapsedRealtime - l.longValue() >= 300000) {
            this.lastRefreshAtMs.put(str, Long.valueOf(jElapsedRealtime));
            AnonymousClass001.A1J(new C138861(str, g0u, null), this.refreshScope);
        }
    }

    public /* synthetic */ SpacesDiskCache(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
