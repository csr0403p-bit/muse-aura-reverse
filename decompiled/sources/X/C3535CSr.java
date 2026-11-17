package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.firebase.iid.zzaa;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.CSr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3535CSr {
    public static final Eu7 A00(Context context, Eu7 eu7, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }
        Properties properties = new Properties();
        KeyPair keyPair = eu7.A01;
        properties.setProperty("pub", Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        properties.setProperty("pri", Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        properties.setProperty("cre", String.valueOf(eu7.A00));
        File fileA04 = A04(context);
        try {
            fileA04.createNewFile();
            RandomAccessFile randomAccessFileA0M = BV4.A0M(fileA04);
            try {
                FileChannel channel = randomAccessFileA0M.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            Eu7 eu7A03 = A03(channel);
                            channel.close();
                            randomAccessFileA0M.close();
                            return eu7A03;
                        } catch (zzaa | IOException e) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String strValueOf = String.valueOf(e);
                                BV8.A1P(BV4.A0p(BV5.A04(strValueOf) + 64), "Tried reading key pair before writing new one, but failed with: ", strValueOf, "FirebaseInstanceId");
                            }
                        }
                    }
                    channel.position(0L);
                    properties.store(Channels.newOutputStream(channel), (String) null);
                    channel.close();
                    randomAccessFileA0M.close();
                    return eu7;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            String strValueOf2 = String.valueOf(e2);
            Log.w("FirebaseInstanceId", C60P.A1M("Failed to write key: ", strValueOf2, BV4.A0p(BV5.A04(strValueOf2) + 21)));
            return null;
        }
    }

    public static Eu7 A03(FileChannel fileChannel) throws IOException, zzaa {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new Eu7(A05(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new zzaa(e);
        }
    }

    public static File A04(Context context) {
        String strA0v;
        if (TextUtils.isEmpty("")) {
            strA0v = "com.google.InstanceId.properties";
        } else {
            try {
                String strA0q = BV6.A0q("".getBytes(HatchWebPageParserKt.UTF_8));
                StringBuilder sbA0p = BV4.A0p(BV5.A04(strA0q) + 33);
                sbA0p.append("com.google.InstanceId_");
                sbA0p.append(strA0q);
                strA0v = AnonymousClass001.A0v(".properties", sbA0p);
            } catch (UnsupportedEncodingException e) {
                throw BV4.A0N(e);
            }
        }
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        return C3cG.A0O(noBackupFilesDir, strA0v);
    }

    public static KeyPair A05(String str, String str2) throws NoSuchAlgorithmException, zzaa {
        try {
            byte[] bArrDecode = Base64.decode(str, 8);
            byte[] bArrDecode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrDecode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String strValueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", C60P.A1M("Invalid key stored ", strValueOf, BV4.A0p(BV5.A04(strValueOf) + 19)));
                throw new zzaa(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzaa(e2);
        }
    }

    public static final void A06(Context context, Eu7 eu7) {
        SharedPreferences sharedPreferencesA07 = BV4.A07(context, "com.google.android.gms.appid");
        try {
            if (eu7.equals(A01(sharedPreferencesA07))) {
                return;
            }
        } catch (zzaa unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesA07.edit();
        String strA00 = C3536CSs.A00("|P|");
        KeyPair keyPair = eu7.A01;
        editorEdit.putString(strA00, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        editorEdit.putString(C3536CSs.A00("|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        editorEdit.putString(C3536CSs.A00("cre"), String.valueOf(eu7.A00));
        editorEdit.commit();
    }

    public final Eu7 A07(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            Eu7 eu7 = new Eu7(keyPairGenerator.generateKeyPair(), System.currentTimeMillis());
            Eu7 eu7A00 = A00(context, eu7, true);
            if (eu7A00 != null && !eu7A00.equals(eu7)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
                }
                return eu7A00;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            A06(context, eu7);
            return eu7;
        } catch (NoSuchAlgorithmException e) {
            throw BV4.A0N(e);
        }
    }

    public static Eu7 A01(SharedPreferences sharedPreferences) throws NoSuchAlgorithmException, NumberFormatException, zzaa {
        long j;
        String string = sharedPreferences.getString(C3536CSs.A00("|P|"), null);
        String string2 = sharedPreferences.getString(C3536CSs.A00("|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair keyPairA05 = A05(string, string2);
        String string3 = sharedPreferences.getString(C3536CSs.A00("cre"), null);
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
        } else {
            j = 0;
        }
        return new Eu7(keyPairA05, j);
    }

    public static final Eu7 A02(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        FileInputStream fileInputStreamA0H = BV4.A0H(file);
        try {
            FileChannel channel = fileInputStreamA0H.getChannel();
            try {
                channel.lock(0L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, true);
                Eu7 eu7A03 = A03(channel);
                channel.close();
                fileInputStreamA0H.close();
                return eu7A03;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStreamA0H.close();
                    throw th2;
                } finally {
                    CU0.A00.A00(th, th);
                }
            }
        }
    }
}
