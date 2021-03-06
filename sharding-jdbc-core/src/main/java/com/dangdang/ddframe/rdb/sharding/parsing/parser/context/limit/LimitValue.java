/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.parsing.parser.context.limit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 分页值对象.
 * 分成两种情况：
 * 1. 占位服
 * 2. 值
 *
 * @author zhangliang
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public final class LimitValue {
    /**
     * 值
     * 当 value == -1 时，为占位符
     */
    private int value;
    /**
     * 第几个占位符
     */
    private int index;
}
