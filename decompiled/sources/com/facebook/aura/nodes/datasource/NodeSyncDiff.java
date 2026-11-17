package com.facebook.aura.nodes.datasource;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.nodes.core.NodeWireJsonKt;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class NodeSyncDiff {
    public static final int DIGEST_BUFFER_CHARS = 8192;
    public static final NodeSyncDiff INSTANCE = new NodeSyncDiff();

    public final class Result extends C06G {
        public final List<String> added;
        public final List<String> removed;
        public final List<String> updated;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Result) {
                    Result result = (Result) obj;
                    if (!C7384Etj.areEqual(this.added, result.added) || !C7384Etj.areEqual(this.updated, result.updated) || !C7384Etj.areEqual(this.removed, result.removed)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = result.added;
            }
            if ((i & 2) != 0) {
                list2 = result.updated;
            }
            if ((i & 4) != 0) {
                list3 = result.removed;
            }
            return result.copy(list, list2, list3);
        }

        public final List<String> component1() {
            return this.added;
        }

        public final List<String> component2() {
            return this.updated;
        }

        public final List<String> component3() {
            return this.removed;
        }

        public final List<String> getAdded() {
            return this.added;
        }

        public final List<String> getRemoved() {
            return this.removed;
        }

        public final List<String> getUpdated() {
            return this.updated;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.removed, AnonymousClass005.A0F(this.updated, AnonymousClass005.A0E(this.added)));
        }

        public final boolean isEmpty() {
            return this.added.isEmpty() && this.updated.isEmpty() && this.removed.isEmpty();
        }

        public Result(List<String> list, List<String> list2, List<String> list3) {
            AnonymousClass005.A0x(list, list2, list3);
            this.added = list;
            this.updated = list2;
            this.removed = list3;
        }

        public final Result copy(List<String> list, List<String> list2, List<String> list3) {
            AnonymousClass005.A0x(list, list2, list3);
            return new Result(list, list2, list3);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.facebook.aura.nodes.datasource.NodeSyncDiff$digestUtf8$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Integer.valueOf(b & 255));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    public final String canonicalHash(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
        BufferedWriter bufferedWriterA0V = C60R.A0V(messageDigest);
        try {
            NodeWireJsonKt.appendJson(bufferedWriterA0V, jsonElement, true);
            return C60R.A0e(bufferedWriterA0V, messageDigest);
        } finally {
        }
    }

    public final Result computeDiff(Map<String, String> map, Map<String, String> map2) {
        C7384Etj.A0Y(map, 0);
        if (map2 == null) {
            C0881AGi c0881AGi = C0881AGi.A00;
            return new Result(c0881AGi, c0881AGi, c0881AGi);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            String str = map2.get(key);
            if (str == null) {
                arrayListA0h.add(key);
            } else if (!str.equals(value)) {
                arrayListA0h2.add(key);
            }
        }
        Set<String> setKeySet = map2.keySet();
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (String str2 : setKeySet) {
            if (!map.containsKey(str2)) {
                arrayListA0h3.add(str2);
            }
        }
        return new Result(arrayListA0h, arrayListA0h2, arrayListA0h3);
    }

    public final String sha256Hex(String str) throws NoSuchAlgorithmException {
        C7384Etj.A0Y(str, 0);
        MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
        BufferedWriter bufferedWriterA0V = C60R.A0V(messageDigest);
        try {
            bufferedWriterA0V.append((CharSequence) str);
            return C60R.A0e(bufferedWriterA0V, messageDigest);
        } finally {
        }
    }

    public final String sha256HexParts(CharSequence... charSequenceArr) {
        C7384Etj.A0Y(charSequenceArr, 0);
        MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
        BufferedWriter bufferedWriterA0V = C60R.A0V(messageDigest);
        try {
            for (CharSequence charSequence : charSequenceArr) {
                bufferedWriterA0V.append(charSequence);
            }
            return C60R.A0e(bufferedWriterA0V, messageDigest);
        } finally {
        }
    }

    private final String digestUtf8(G0U<? super Writer, Unit> g0u) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
        BufferedWriter bufferedWriterA0V = C60R.A0V(messageDigest);
        try {
            g0u.invoke(bufferedWriterA0V);
            return C60R.A0e(bufferedWriterA0V, messageDigest);
        } finally {
        }
    }

    public final class MessageDigestOutputStream extends OutputStream {
        public final MessageDigest digest;

        public MessageDigestOutputStream(MessageDigest messageDigest) {
            C7384Etj.A0Y(messageDigest, 0);
            this.digest = messageDigest;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C7384Etj.A0Y(bArr, 0);
            this.digest.update(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.digest.update((byte) i);
        }
    }
}
