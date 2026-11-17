package com.facebook.forker;

import X.BV4;
import java.io.FileDescriptor;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public final class Fd {
    public static volatile Field mDescriptorField;

    public static int fileno(FileDescriptor fileDescriptor) throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = mDescriptorField;
            if (declaredField == null) {
                declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                mDescriptorField = declaredField;
            }
            return declaredField.getInt(fileDescriptor);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw BV4.A0e(e);
        }
    }

    public static FileDescriptor of(int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            Field declaredField = mDescriptorField;
            if (declaredField == null) {
                declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                mDescriptorField = declaredField;
            }
            declaredField.setInt(fileDescriptor, i);
            return fileDescriptor;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw BV4.A0e(e);
        }
    }
}
