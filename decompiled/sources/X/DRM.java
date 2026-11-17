package X;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
/* loaded from: classes5.dex */
public final class DRM implements SharedPreferences {
    public final SharedPreferences A00;
    public final EX9 A01;
    public final EXA A02;
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> A03 = new CopyOnWriteArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static Object A00(DRM drm, String str) {
        String str2;
        String str3;
        if (A01(str)) {
            throw new SecurityException(FGI.A0M(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA02 = drm.A02(str);
            String string = drm.A00.getString(strA02, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA01 = DRH.A01(string);
            EX9 ex9 = drm.A01;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(ex9.A8i(bArrA01, strA02.getBytes(charset)));
            byteBufferWrap.position(0);
            int i = byteBufferWrap.getInt();
            Integer num = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : C79.A0T : C79.A0P : C79.A0K : C79.A0C : C79.A01 : C79.A00;
            if (num == null) {
                throw new SecurityException(FGI.A0H("Unknown type ID for encrypted pref value: ", i));
            }
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                int i2 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i2);
                String string2 = charset.decode(byteBufferSlice).toString();
                boolean zEquals = string2.equals("__NULL__");
                str2 = string2;
                if (zEquals) {
                    return null;
                }
            } else {
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        return Integer.valueOf(byteBufferWrap.getInt());
                    }
                    if (iIntValue == 3) {
                        return Long.valueOf(byteBufferWrap.getLong());
                    }
                    if (iIntValue == 4) {
                        return Float.valueOf(byteBufferWrap.getFloat());
                    }
                    if (iIntValue == 5) {
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    }
                    switch (iIntValue) {
                        case 1:
                            str3 = "STRING_SET";
                            break;
                        case 2:
                            str3 = "INT";
                            break;
                        case 3:
                            str3 = "LONG";
                            break;
                        case 4:
                            str3 = "FLOAT";
                            break;
                        case 5:
                            str3 = "BOOLEAN";
                            break;
                        default:
                            str3 = "STRING";
                            break;
                    }
                    throw new SecurityException(FGI.A0M("Unhandled type for encrypted pref value: ", str3));
                }
                Ao0 ao0 = new Ao0(0);
                while (byteBufferWrap.hasRemaining()) {
                    int i3 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i3);
                    BV7.A1L(byteBufferWrap, i3);
                    ao0.add(charset.decode(byteBufferSlice2).toString());
                }
                int size = ao0.size();
                str2 = ao0;
                if (size == 1) {
                    boolean zEquals2 = "__NULL__".equals(ao0.A02[0]);
                    str2 = ao0;
                    if (zEquals2) {
                        return null;
                    }
                }
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException(BV5.A0n("Could not decrypt value. ", e), e);
        }
    }

    public static final boolean A01(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String A02(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return DRH.A00(this.A02.AAX(str.getBytes(StandardCharsets.UTF_8), "hpke_key_storage".getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException(BV5.A0n("Could not encrypt key. ", e), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new DRL(this.A00.edit(), this);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.A03.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.A03.remove(onSharedPreferenceChangeListener);
    }

    public DRM(SharedPreferences sharedPreferences, EX9 ex9, EXA exa) {
        this.A00 = sharedPreferences;
        this.A01 = ex9;
        this.A02 = exa;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (A01(str)) {
            throw new SecurityException(FGI.A0M(str, " is a reserved key for the encryption keyset."));
        }
        return this.A00.contains(A02(str));
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap mapA0u = BV4.A0u();
        Iterator itA0n = AnonymousClass002.A0n(this.A00.getAll());
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (!A01(C60O.A0t(entryA0l))) {
                try {
                    String str = new String(this.A02.A8j(DRH.A01(C60O.A0t(entryA0l)), "hpke_key_storage".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    mapA0u.put(str, A00(this, str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException(BV5.A0n("Could not decrypt key. ", e), e);
                }
            }
        }
        return mapA0u;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objA00 = A00(this, str);
        return objA00 instanceof Boolean ? AnonymousClass001.A1X(objA00) : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objA00 = A00(this, str);
        return objA00 instanceof Float ? AnonymousClass001.A02(objA00) : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objA00 = A00(this, str);
        return objA00 instanceof Integer ? AnonymousClass001.A0F(objA00) : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objA00 = A00(this, str);
        return objA00 instanceof Long ? C3cG.A05(objA00) : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objA00 = A00(this, str);
        return objA00 instanceof String ? (String) objA00 : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Object objA00 = A00(this, str);
        Set<String> ao0 = objA00 instanceof Set ? (Set) objA00 : new Ao0<>(0);
        return ao0.size() > 0 ? ao0 : set;
    }
}
