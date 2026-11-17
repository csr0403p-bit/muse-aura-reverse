package com.facebook.aura.markdown.render;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C8j3;
import X.FGI;
import X.G0V;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import com.facebook.aura.markdown.render.AuraMarkdownCache;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.memory.AuraMemoryBudget;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AuraMarkdownCache {
    public static final int $stable = 0;
    public static final long ASSUMED_AST_BYTES_PER_SOURCE_CHAR = 8;
    public static final long ENTRY_OVERHEAD_BYTES = 2048;
    public static final int MAX_ENTRIES = 128;
    public static final int MAX_ENTRY_FRACTION = 4;
    public static final AuraMarkdownCache INSTANCE = new AuraMarkdownCache();
    public static final long MAX_WEIGHT_BYTES = 6291456;
    public static final long LOW_RAM_MAX_WEIGHT_BYTES = 3145728;
    public static final AuraByteLruCache<Key, AuraMarkdownDocument> cache = new AuraByteLruCache<>(128, MAX_WEIGHT_BYTES, LOW_RAM_MAX_WEIGHT_BYTES, false, 1572864, new G0V() { // from class: com.facebook.aura.markdown.render.AuraMarkdownCache$$ExternalSyntheticLambda0
        @Override // X.G0V
        public final Object invoke(Object obj, Object obj2) {
            return Long.valueOf(AuraMarkdownCache.cache$lambda$0((AuraMarkdownCache.Key) obj, (AuraMarkdownDocument) obj2));
        }
    }, 8, null);

    public final class Key {
        public final String ownerKey;
        public final String source;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Key) {
                    Key key = (Key) obj;
                    if (!C7384Etj.areEqual(this.ownerKey, key.ownerKey) || !C7384Etj.areEqual(this.source, key.source)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Key copy$default(Key key, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.ownerKey;
            }
            if ((i & 2) != 0) {
                str2 = key.source;
            }
            AnonymousClass003.A0u(str, str2);
            return new Key(str, str2);
        }

        public final String component1() {
            return this.ownerKey;
        }

        public final String component2() {
            return this.source;
        }

        public final String getOwnerKey() {
            return this.ownerKey;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.source, AnonymousClass001.A0G(this.ownerKey));
        }

        public String toString() {
            return FGI.A0h("Key(ownerKey=", this.ownerKey, ", source=", this.source, ")");
        }

        public Key(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.ownerKey = str;
            this.source = str2;
        }

        public final Key copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Key(str, str2);
        }
    }

    public static final long cache$lambda$0(Key key, AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(key, 0);
        return INSTANCE.estimatedWeightBytes(key);
    }

    public final AuraMarkdownDocument parse(String str, String str2) {
        if (C8j3.A0J(str2, 1) == 0) {
            return AuraMarkdownDocument.EMPTY;
        }
        if (str == null) {
            return AuraMarkdown.INSTANCE.parse(str2, true);
        }
        Key key = new Key(str, str2);
        AuraByteLruCache<Key, AuraMarkdownDocument> auraByteLruCache = cache;
        AuraMarkdownDocument auraMarkdownDocument = auraByteLruCache.get(key);
        return auraMarkdownDocument == null ? auraByteLruCache.putIfAbsent(key, AuraMarkdown.INSTANCE.parse(str2, true)) : auraMarkdownDocument;
    }

    public final boolean parsesAsParagraphsOnly(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        AHD<AuraBlock> ahd = parse(str, str2).blocks;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof AuraBlock.Paragraph)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final long estimatedWeightBytes(Key key) {
        AuraMemoryBudget auraMemoryBudget = AuraMemoryBudget.INSTANCE;
        return auraMemoryBudget.stringBytes(key.ownerKey) + 2048 + auraMemoryBudget.stringBytes(key.source) + (r2.length() * 8);
    }

    public final void clear() {
        cache.clear();
    }
}
