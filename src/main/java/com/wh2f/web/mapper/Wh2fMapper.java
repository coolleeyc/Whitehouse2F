package com.wh2f.web.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.wh2f.web.dto.ItemInfoDTO;

public interface Wh2fMapper {
	public ItemInfoDTO selectProduct(@Param("item_code") int item_code);
}
