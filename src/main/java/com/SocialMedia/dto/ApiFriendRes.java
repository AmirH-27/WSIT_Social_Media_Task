package com.SocialMedia.dto;

import com.SocialMedia.entity.Friend;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiFriendRes {
    int numberOfFriends;
    Friend friend;
    Pageable pageable;
    int total_pages;
}
