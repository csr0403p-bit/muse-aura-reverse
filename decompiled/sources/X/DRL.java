package X;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DRL implements SharedPreferences.Editor {
    public final SharedPreferences.Editor A00;
    public final DRM A01;
    public final AtomicBoolean A03 = C60O.A1E();
    public final List<String> A02 = new CopyOnWriteArrayList();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        A02(str, byteBufferAllocate.array());
        return this;
    }

    private void A00() {
        if (this.A03.getAndSet(false)) {
            DRM drm = this.A01;
            Iterator itA11 = BV5.A11(drm.getAll());
            while (itA11.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA11);
                if (!this.A02.contains(strA0j) && !DRM.A01(strA0j)) {
                    this.A00.remove(drm.A02(strA0j));
                }
            }
        }
    }

    private void A01() {
        DRM drm = this.A01;
        Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = drm.A03.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
            Iterator<String> it2 = this.A02.iterator();
            while (it2.hasNext()) {
                next.onSharedPreferenceChanged(drm, AnonymousClass005.A0j(it2));
            }
        }
    }

    private void A02(String str, byte[] bArr) {
        DRM drm = this.A01;
        if (DRM.A01(str)) {
            throw new SecurityException(FGI.A0M(str, " is a reserved key for the encryption keyset."));
        }
        this.A02.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA02 = drm.A02(str);
            Pair pairA0A = BV4.A0A(strA02, DRH.A00(drm.A01.AAW(bArr, strA02.getBytes(StandardCharsets.UTF_8))));
            this.A00.putString((String) pairA0A.first, (String) pairA0A.second);
        } catch (GeneralSecurityException e) {
            throw new SecurityException(BV5.A0n("Could not encrypt data: ", e), e);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.A03.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f);
        A02(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i);
        A02(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        A02(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        A02(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        Set<String> set2 = set;
        if (set == null) {
            Ao0 ao0 = new Ao0(0);
            ao0.add("__NULL__");
            set2 = ao0;
        }
        ArrayList arrayListA11 = C60O.A11(set2.size());
        int size = set2.size() * 4;
        Iterator<String> it = set2.iterator();
        while (it.hasNext()) {
            byte[] bytes = AnonymousClass005.A0j(it).getBytes(StandardCharsets.UTF_8);
            arrayListA11.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        Iterator it2 = arrayListA11.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        A02(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        DRM drm = this.A01;
        if (DRM.A01(str)) {
            throw new SecurityException(FGI.A0M(str, " is a reserved key for the encryption keyset."));
        }
        this.A00.remove(drm.A02(str));
        this.A02.add(str);
        return this;
    }

    public DRL(SharedPreferences.Editor editor, DRM drm) {
        this.A01 = drm;
        this.A00 = editor;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        A00();
        this.A00.apply();
        A01();
        this.A02.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        A00();
        try {
            return this.A00.commit();
        } finally {
            A01();
            this.A02.clear();
        }
    }
}
