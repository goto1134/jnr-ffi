/*
 * Copyright (C) 2012 Wayne Meissner
 *
 * This file is part of the JNR project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jnr.ffi.provider.jffi;

import jnr.ffi.util.ref.FinalizableReferenceQueue;

/**
 *
 */
class NativeFinalizer {
    private final FinalizableReferenceQueue finalizerQueue = new FinalizableReferenceQueue();
    
    private static final class SingletonHolder {
        private static final NativeFinalizer INSTANCE = new NativeFinalizer();
    }
    
    public static NativeFinalizer getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public FinalizableReferenceQueue getFinalizerQueue() {
        return finalizerQueue;
    }
}
