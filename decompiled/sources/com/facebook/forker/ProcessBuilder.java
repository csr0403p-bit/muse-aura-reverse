package com.facebook.forker;

import X.AbstractC3416CMe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.C3380CIk;
import X.C3cG;
import X.C3cH;
import X.C60O;
import android.content.Context;
import android.util.Log;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ProcessBuilder implements Cloneable {
    public static final String TAG = "fb-ProcessBuilder";
    public ArrayList<String> mArgv;
    public byte[] mEnvironCache;
    public ArrayList<String> mEnvironKeys;
    public ArrayList<String> mEnvironValues;
    public String mExecutable;
    public BitSet mKeepFds;
    public int[] mStreamDispositions;
    public File mTmpDir;

    public ProcessBuilder setenv(String str, String str2) {
        if (str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
            throw C60O.A0i("environment variables cannot contain NUL");
        }
        if (str.indexOf(61) != -1) {
            throw C60O.A0i("environment variable names cannot contain '='");
        }
        unsetenv(str);
        this.mEnvironKeys.add(str);
        this.mEnvironValues.add(str2);
        this.mEnvironCache = null;
        return this;
    }

    public static File genDefaultTmpDir(Context context) {
        C3380CIk c3380CIk = SC.android_fbapps_forker_tempdir;
        AnonymousClass003.A0u(context, c3380CIk);
        File fileA00 = AbstractC3416CMe.A00(context, c3380CIk.A00);
        fileA00.mkdirs();
        return fileA00;
    }

    private byte[] makeEnvironBlock() {
        ArrayList<String> arrayList = this.mEnvironKeys;
        if (arrayList != null && this.mEnvironCache == null) {
            this.mEnvironCache = buildEnvironBlock(arrayList, this.mEnvironValues);
        }
        return this.mEnvironCache;
    }

    public ProcessBuilder addArgument(String str) {
        this.mArgv.add(str);
        return this;
    }

    public ProcessBuilder clearenv() {
        ArrayList<String> arrayList = this.mEnvironKeys;
        if (arrayList == null) {
            this.mEnvironKeys = C3cG.A0h();
            this.mEnvironValues = C3cG.A0h();
            return this;
        }
        arrayList.clear();
        this.mEnvironValues.clear();
        this.mEnvironCache = null;
        return this;
    }

    public Process create() {
        int i = Process.FD_STREAM_INPUT;
        String str = this.mExecutable;
        ArrayList<String> arrayList = this.mArgv;
        return new Process(str, BV5.A1b(arrayList, arrayList.size()), makeEnvironBlock(), getArrayOfSetBits(this.mKeepFds), this.mStreamDispositions, this.mTmpDir);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void freezeEnviron() {
        if (this.mEnvironKeys == null) {
            Map<String, String> map = System.getenv();
            int size = map.size();
            ArrayList<String> arrayListA11 = C60O.A11(size);
            ArrayList<String> arrayListA112 = C60O.A11(size);
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                arrayListA11.add(entryA0l.getKey());
                arrayListA112.add(entryA0l.getValue());
            }
            this.mEnvironKeys = arrayListA11;
            this.mEnvironValues = arrayListA112;
        }
    }

    public ProcessBuilder setFdCloseOnExec(int i, boolean z) {
        BitSet bitSet = this.mKeepFds;
        if (z) {
            bitSet.clear(i);
            return this;
        }
        bitSet.set(i);
        return this;
    }

    public ProcessBuilder setStream(int i, int i2) {
        this.mStreamDispositions[i] = i2;
        return this;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.format("<ProcessBuilder executable=[%s] argv=[", this.mExecutable);
        for (int i = 0; i < this.mArgv.size(); i++) {
            if (i > 0) {
                printWriter.print(InviteCodeScratcherKt.CODE_SEPARATOR);
            }
            printWriter.print(this.mArgv.get(i));
        }
        printWriter.format("] keepFds=[%s] streamDispositions=[%s]", Arrays.toString(getArrayOfSetBits(this.mKeepFds)), Arrays.toString(this.mStreamDispositions));
        printWriter.print(">");
        return stringWriter.toString();
    }

    public ProcessBuilder() {
        int iIndexOf;
        this.mArgv = C3cG.A0h();
        BitSet bitSet = new BitSet();
        this.mKeepFds = bitSet;
        this.mStreamDispositions = new int[]{-3, -3, -3};
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(2);
        String str = System.getenv("ANDROID_PROPERTY_WORKSPACE");
        if (str == null || (iIndexOf = str.indexOf(44)) == -1) {
            return;
        }
        try {
            this.mKeepFds.set(Integer.parseInt(str.substring(0, iIndexOf)));
        } catch (NumberFormatException e) {
            Log.d(TAG, "cannot parse property workspace FD", e);
        }
    }

    public static byte[] buildEnvironBlock(ArrayList<String> arrayList, ArrayList<String> arrayList2) throws IOException {
        int size = arrayList.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += arrayList.get(i).length() + 1 + arrayList2.get(i).length() + 1;
        }
        try {
            UnsafeByteArrayOutputStream unsafeByteArrayOutputStream = new UnsafeByteArrayOutputStream(length);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(unsafeByteArrayOutputStream));
            for (int i2 = 0; i2 < size; i2++) {
                bufferedWriter.write(arrayList.get(i2));
                bufferedWriter.write(61);
                bufferedWriter.write(arrayList2.get(i2));
                bufferedWriter.write(0);
            }
            bufferedWriter.flush();
            return unsafeByteArrayOutputStream.getRawBuffer();
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    public static int[] getArrayOfSetBits(BitSet bitSet) {
        int[] iArr = new int[bitSet.cardinality()];
        int i = 0;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (iNextSetBit != -1) {
            iArr[i] = iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            i++;
        }
        return iArr;
    }

    public ProcessBuilder addArguments(Iterable<String> iterable) {
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            addArgument(AnonymousClass005.A0j(it));
        }
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ProcessBuilder m3168clone() {
        makeEnvironBlock();
        try {
            ProcessBuilder processBuilder = (ProcessBuilder) super.clone();
            processBuilder.mArgv = (ArrayList) this.mArgv.clone();
            processBuilder.mKeepFds = (BitSet) this.mKeepFds.clone();
            processBuilder.mStreamDispositions = (int[]) this.mStreamDispositions.clone();
            ArrayList<String> arrayList = this.mEnvironKeys;
            if (arrayList != null) {
                processBuilder.mEnvironKeys = (ArrayList) arrayList.clone();
                processBuilder.mEnvironValues = (ArrayList) this.mEnvironValues.clone();
            }
            byte[] bArr = this.mEnvironCache;
            if (bArr != null) {
                processBuilder.mEnvironCache = (byte[]) bArr.clone();
            }
            processBuilder.mTmpDir = this.mTmpDir;
            return processBuilder;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0N(e);
        }
    }

    public ProcessBuilder setExecutable(String str) {
        this.mExecutable = str;
        return this;
    }

    public ProcessBuilder setTmpDir(File file) {
        this.mTmpDir = file;
        return this;
    }

    public ProcessBuilder unsetenv(String str) {
        freezeEnviron();
        ArrayList<String> arrayList = this.mEnvironKeys;
        ArrayList<String> arrayList2 = this.mEnvironValues;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (str.equals(arrayList.get(i))) {
                this.mEnvironCache = null;
                arrayList.remove(i);
                arrayList2.remove(i);
                break;
            }
            i++;
        }
        return this;
    }

    public ProcessBuilder(String str, String... strArr) {
        this();
        this.mExecutable = str;
        ArrayList<String> arrayList = this.mArgv;
        arrayList.add(str);
        for (String str2 : strArr) {
            arrayList.add(str2);
        }
    }

    public ProcessBuilder addArguments(String... strArr) {
        for (String str : strArr) {
            this.mArgv.add(str);
        }
        return this;
    }
}
